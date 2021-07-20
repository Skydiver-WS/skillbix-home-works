import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
  private static String inputText;
  private static String text = "";
  private final static String INPUT_ITEMS = "Для добавления email введите команду ADD и введите email  формате email@email.com" +
    "\nДля вывода списка всех дел введите команду LIST" +
    "\nДля выхода из программы введите команду EXIT";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

  public static void main(String[] args) {
    //TODO: write code here
    EmailList emailList = new EmailList();
    System.out.println(INPUT_ITEMS);
    while (true) {
      setInputText();
      if (inputText.matches("ADD.*")) {
        inputText = inputText.replaceFirst("ADD\\s+", "").toLowerCase();
        if (emailList.getSortedEmails().contains(inputText)) {
          System.out.println("Данные email уже существует. Выберете один из предложенных или придумайте новый:");
          generateListEmail(inputText);
        } else {
          emailList.add(inputText);
          System.out.println(inputText.matches("\\w+@\\w+\\.\\w+") ? "Email " + inputText + " успешно добавлен." : WRONG_EMAIL_ANSWER);
        }
      } else if (inputText.equals("LIST")) {
        for (String treeSet : emailList.getSortedEmails()) {
          System.out.println(treeSet);
        }
      } else if (inputText.equals("EXIT")) {
        break;
      }
    }
  }

  private static void setInputText() {
    Scanner scanner = new Scanner(System.in);
    inputText = scanner.nextLine();
  }

  private static void generateRandomEmail() {
    int aCharCode = 97;
    int zCharCode = 122;
    int zeroCharCode = 48;
    int nineCharCode = 57;
    int countChar = (int) (1 + Math.random() * 10);
    for (int i = 0; i < countChar; i++) {
      int numberOrLetter = (int) (1 + Math.random() * 10);
      char character;
      if (numberOrLetter < 5) {
        character = (char) (aCharCode + Math.random() * (zCharCode - aCharCode));
      } else {
        character = (char) (zeroCharCode + Math.random() * (nineCharCode - zeroCharCode));
      }
      text += String.valueOf(character);
    }
  }

  private static void generateListEmail(String newEmail) {
    ArrayList<String> optionsEmail = new ArrayList<>();
    optionsEmail.trimToSize();

    for (int i = 0; i < 5; i++) {
      String[] splitEmail = newEmail.split("@");
      ArrayList<String> wordsEmail = new ArrayList<>(Arrays.asList(splitEmail)); // почитать про asList
      generateRandomEmail();
      wordsEmail.add(1, text + "@");
      text = "";
      String email = "";
      for (String s : wordsEmail) {
        email += s;
      }
      optionsEmail.add(email);
      wordsEmail.clear();
      System.out.println(optionsEmail.get(i));
    }
    optionsEmail.clear();
  }
}

