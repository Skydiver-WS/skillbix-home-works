import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Hospital {
  private static final float LOW_LIMIT_POSITIVE_TEMP = (float) 36.2;
  private static final float HIGH_LIMIT_POSITIVE_TEMP = (float) 36.9;
  private static float[] temperatureGenerate;
  private static float averageTemperature;

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float minTemp = 32;
    float maxTemp = 40;
    temperatureGenerate = new float[patientsCount];
    //temperatureGenerate = new float[]{32.1F, 33.1F, 32.5F, 33.5F, 34.5F, 36.5F, 38.5F, 39.5F, 33.3F, 32.7F, 36.9F, 36.5F, 34.3F, 37.5F, 32.5F, 32.5F, 32.4F, 34.5F, 35.4F, 32.5F, 34.5F, 39.4F, 32.5F, 36.5F, 36.4F, 39.6F, 37.5F, 32.5F, 37.5F, 39.4F};
    for (int i = 0; i < temperatureGenerate.length; i++) {
      temperatureGenerate[i] = minTemp + (float) (Math.random()) * ((maxTemp) - minTemp);
      averageTemperature += temperatureGenerate[i];
      BigDecimal bigDecimal = BigDecimal.valueOf(temperatureGenerate[i]);
      temperatureGenerate[i] = Float.parseFloat(String.valueOf(bigDecimal.setScale(1, RoundingMode.HALF_UP)));
    }
    averageTemperature = averageTemperature / temperatureGenerate.length;
    return temperatureGenerate;
  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    String temperaturesPatient = Arrays.toString(temperatureGenerate);
    temperaturesPatient = temperaturesPatient.replaceAll("[^\\d+\\s.]", "");
    int numberOfHealthy = 0;
    temperatureData = temperatureGenerate;
    for (float j : temperatureData) {
      if (j >= LOW_LIMIT_POSITIVE_TEMP && j <= HIGH_LIMIT_POSITIVE_TEMP) {
        numberOfHealthy++;
      }
    }
    return "Температуры пациентов: " + temperaturesPatient +
      "\nСредняя температура: " + Math.round(averageTemperature * 100.0) / 100.0 +
      "\nКоличество здоровых: " + numberOfHealthy;
  }
}
