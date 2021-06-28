import java.util.Scanner;

public class Main {
  private static final TodoList todoList = new TodoList();
  private static String inputText;
  private static int inputIndex;
  private final static String INPUT_ITEMS = "Для добавления дела нажмите 1." +
    "\nДля добавления дела по индексу нажмите 2." +
    "\nДля замены дела нажмите 3." +
    "\nДля удаления дела нажмите 4" +
    "\nДля вывода списка всех дел нажмите 5" +
    "\nДля вывода всех команд нажмите 9" +
    "\nДля выхода из программы нажмите 0";

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println(INPUT_ITEMS);
    label:
    // метка, почитать про switch/case, неплохая замена if при необходимости выбора пунктов
    while (true) {
      System.out.println("Выберете пункт и нажмите Enter.");
      setInputIndex();
      switch (inputIndex) {
        case 1: // Добавление дела
          System.out.println("Введите дело:");
          setInputText();
          todoList.add(inputText);
          System.out.println("Добавлено дело " + inputText);
          break;
        case 2: // Добавление дела по индексу
          System.out.println("Введите индекс:");
          setInputIndex();
          System.out.println("Введите дело:");
          setInputText();
          todoList.add(inputIndex, inputText);
          System.out.println("Добавлено дело " + inputText);
          break;
        case 3: // Замена дела по индексу
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
        case 4: // Удаление дела
          if (!todoList.getTodos().isEmpty()) {
            System.out.println("Выберете индекс дела для удаления:");
            setInputIndex();
            todoList.delete(inputIndex);
            System.out.println(inputIndex <= todoList.getTodos().size() ? "Дело - " + todoList.getListOfOldCases() + " удалено" : "");
          } else {
            System.out.println("Список дел пуст");
          }
          break;
        case 5: // Вывод списка дел
          System.out.println((todoList.getTodos().isEmpty()) ? "Список дел пуст" : "");
          for (int i = 0; i < todoList.getTodos().size(); i++) {
            System.out.println(i + " - " + todoList.getTodos().get(i));
          }
          break;
        case 9: // Вывод пунктов меню
          System.out.println(INPUT_ITEMS);
          break;
        case 0: // выход из программы
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
