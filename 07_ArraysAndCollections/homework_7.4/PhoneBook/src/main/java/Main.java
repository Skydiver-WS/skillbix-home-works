import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  private static String inputText;
  private static String addContact;
  private static final Scanner scanner = new Scanner(System.in);
  private static final PhoneBook phoneBook = new PhoneBook();
  private static final Pattern patternInputPhone = Pattern.compile("\\d+");
  private static final Pattern patternInputName = Pattern.compile("[A-Za-zА-Яа-яЁё]+");

  public static void main(String[] args) {
    String command = "Введите номер, имя или команду:";

    while (true) {
      System.out.println(command);
      inputText = scanner.nextLine();
      inputText = inputText.replaceFirst("\\+7|8", "7");
      Matcher matcherInputPhone = patternInputPhone.matcher(inputText);
      Matcher matcherInputName = patternInputName.matcher(inputText);
      if (inputText.equals("LIST")) {
        for (String list : phoneBook.getAllContacts()) {
          System.out.println(list);
        }
      } else if (inputText.equals("EXIT")) {
        break;
      } else if (matcherInputName.matches()) {
        addName(inputText);
      } else if (matcherInputPhone.matches()) {
        addPhone(inputText);
      } else {
        System.out.println("Неверный формат ввода");
      }
    }
  }

  private static void addPhone(String phone) {
    if (phoneBook.getNameByPhone(phone).equals("")) {
      System.out.println("Такого номера нет в телефонной книге." + "\n" + "Введите имя абонента для номера" + " “" + phone + "“ ");
      inputText = scanner.nextLine();
      addContact = inputText + " - " + phone;
      phoneBook.addContact(phone, inputText);
      System.out.println(addContact.equals(phoneBook.getNameByPhone(phone)) ? "Контакт сохранен!" : "Неверный формат ввода.");
    } else {
      System.out.println("Такой номер есть в телефонной книге." + "\n" + phoneBook.getNameByPhone(phone));
    }
  }

  private static void addName(String name) {
    if (phoneBook.getPhonesByName(name).isEmpty()) {
      System.out.println("Такого имени в телефонной книге нет." + "\n" + "Введите номер телефона для абонента" + " “" + name + "“ ");
      inputText = scanner.nextLine();
      inputText = inputText.replaceFirst("\\+7|8", "7");
      addContact = name + " - " + inputText;
      phoneBook.addContact(inputText, name);
      System.out.println(addContact.equals(phoneBook.getNameByPhone(inputText)) ? "Контакт сохранен!" : "Неверный формат ввода");
    } else {
      for (String doubleContacts : phoneBook.getPhonesByName(name)) {
        System.out.println("Такой контакт есть в телефонной книге." + "\n" + doubleContacts);
      }
    }
  }
}