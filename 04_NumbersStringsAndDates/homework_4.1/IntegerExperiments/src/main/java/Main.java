public class Main {
    private static int  intermediateNumber;

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(111);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    //@TODO: write code here and delete TODO line
      String convertToText = String.valueOf(number); //преобразование переменной number в тексn
      if (number != null)
      {
          for (int i = 0; i < convertToText.length(); i++) // перебор каждого символа в переменной text
          {
              intermediateNumber += Character.getNumericValue(convertToText.charAt(i));
          }
          return intermediateNumber;
      }
      else
      {
       return -1;
      }
  }
}
