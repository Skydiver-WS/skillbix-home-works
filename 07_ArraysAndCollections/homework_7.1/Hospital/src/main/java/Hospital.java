import java.util.Arrays;

public class Hospital {
  private static final float LOW_LIMIT_POSITIVE_TEMP = (float) 36.2;
  private static final float HIGH_LIMIT_POSITIVE_TEMP = (float) 36.9;
  private static float averageTemperature;

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float minTemp = 32;
    float maxTemp = 40;
    float[] temperatureGenerate = new float[patientsCount];
    for (int i = 0; i < temperatureGenerate.length; i++) {
      temperatureGenerate[i] = minTemp + (float) (Math.random()) * ((maxTemp) - minTemp);
    }
    return temperatureGenerate;
  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    int numberOfHealthy = 0;
    for (int j = 0; j < temperatureData.length; j++) {
      averageTemperature += temperatureData[j];
      temperatureData[j] = Float.parseFloat(String.format("%.1f", temperatureData[j]));
      if (temperatureData[j] >= LOW_LIMIT_POSITIVE_TEMP && temperatureData[j] <= HIGH_LIMIT_POSITIVE_TEMP) {
        numberOfHealthy++;
      }
    }
    averageTemperature = averageTemperature / temperatureData.length;
    return "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll("[^\\d+\\s.]", "") +
      "\nСредняя температура: " + String.format("%.2f", averageTemperature) +
      "\nКоличество здоровых: " + numberOfHealthy;
  }
}
