import java.util.Scanner;

public class Main {
  private static final TodoList todoList = new TodoList();
  private static String inputText;
  private static int inputIndex;
  private final static String INPUT_ITEMS = "Для добавления дела введите ADD." +
    "\nДля добавления дела по индексу введите ADD_INDEX." +
    "\nДля замены дела введите EDIT" +
    "\nДля удаления дела введите DELETE" +
    "\nДля вывода списка всех дел введите LIST" +
    "\nДля вывода всех команд введите HELP" +
    "\nДля выхода из программы введите EXIT";

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println(INPUT_ITEMS);
    label:
    // метка, почитать про switch/case, неплохая замена if при необходимости выбора пунктов
    while (true) {
      System.out.println("Выберете пункт и нажмите Enter.");
      setInputText();
      switch (inputText) {
        case "ADD": // Добавление дела
          System.out.println("Введите дело:");
          setInputText();
          todoList.add(inputText);
          System.out.println("Добавлено дело " + inputText);
          break;
        case "ADD_INDEX": // Добавление дела по индексу
          System.out.println("Введите индекс:");
          setInputIndex();
          System.out.println("Введите дело:");
          setInputText();
          todoList.add(inputIndex, inputText);
          System.out.println("Добавлено дело " + inputText);
          break;
        case "EDIT": // Замена дела по индексу
          if (!todoList.getTodos().isEmpty()) {
            System.out.println("Выберете индекс дела для замены:");
            setInputIndex();
            if (inputIndex <= todoList.getTodos().size()) {
              System.out.println("Введите новое дело:");
              setInputText();
            }
            todoList.edit(inputText, inputIndex);
            System.out.println(inputIndex <= todoList.getTodos().size() ? "Дело - " + todoList.getListOfOldCases() + " заменено на - " + inputText : "");
          } else {
            System.out.println("Список дел пуст");
          }
          break;
        case "DELETE": // Удаление дела
          if (!todoList.getTodos().isEmpty()) {
            System.out.println("Выберете индекс дела для удаления:");
            setInputIndex();
            todoList.delete(inputIndex);
            System.out.println(inputIndex <= todoList.getTodos().size() ? "Дело - " + todoList.getListOfOldCases() + " удалено" : "");
          } else {
            System.out.println("Список дел пуст");
          }
          break;
        case "LIST": // Вывод списка дел
          System.out.println((todoList.getTodos().isEmpty()) ? "Список дел пуст" : "");
          for (int i = 0; i < todoList.getTodos().size(); i++) {
            System.out.println(i + " - " + todoList.getTodos().get(i));
          }
          break;
        case "HELP": // Вывод пунктов меню
          System.out.println(INPUT_ITEMS);
          break;
        case "EXIT": // выход из программы
          break label;
        default:
          System.out.println("Команда не распознана" + "\n");
          break;
      }
    }
  }

  private static void setInputText() {
    Scanner scanner = new Scanner(System.in);
    inputText = scanner.nextLine();
  }

  private static void setInputIndex() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      if (scanner.hasNextInt()) {
        inputIndex = Math.abs(scanner.nextInt());
        break;
      } else {
        System.out.println("Вы ввели не число. Введите число.");
      }
    }
  }

}
