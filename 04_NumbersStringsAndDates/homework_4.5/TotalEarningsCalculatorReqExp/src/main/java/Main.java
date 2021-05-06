import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей");
  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    String[] convertText = text.split("\\D\\D*"); //узнать как работает это выражение.
    int sum = 0;
    for (int i = 1; i < convertText.length; i++) // почему при i=0 появляется пустая строка
    {
      sum = sum + Integer.parseInt(convertText [i]);
    }
    return sum;
  }

}