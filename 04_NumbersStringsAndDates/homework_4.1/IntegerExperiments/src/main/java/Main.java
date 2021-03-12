public class Main {
    public static int number;

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(7843);

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
      String convertToText = String.valueOf(number); //преобразование переменной number в текст
      int intermediateNumber = 0; // промежуточное значение
      if (number != null)
      {
          for (int i = 0; i < convertToText.length(); i++) // перебор каждого символа в переменной text
          {
              char convertToNumber = convertToText.charAt(i); // char преобразование текста в число начинается счёт с 0
              int convertToInteger = Integer.parseInt(String.valueOf(convertToNumber)); //для проведения расчетов необходимо char преобразовать в текст и обратно в Integer
              intermediateNumber += convertToInteger;
          }
          return intermediateNumber;
      }
      else
      {
       return -1;
      }
  }
}
