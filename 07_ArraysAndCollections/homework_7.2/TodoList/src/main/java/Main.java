import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  private static final TodoList todoList = new TodoList();
  private static String inputText;
  private final static String INPUT_ITEMS = "Для добавления дела введите команду ADD Дело" +
    "\nДля добавления дела по индексу введите команду ADD № индекса Дело" +
    "\nДля замены дела введите команду EDIT № индекса Дело" +
    "\nДля удаления дела введите команду DELETE № индекса" +
    "\nДля вывода списка всех дел введите команду LIST" +
    "\nДля вывода всех команд введите команду HELP" +
    "\nДля выхода из программы введите команду EXIT";

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList
    System.out.println(INPUT_ITEMS);
    Pattern add = Pattern.compile("ADD\\s+.*");
    Pattern addIndex = Pattern.compile("ADD\\s\\d+\\s*.*");
    Pattern edit = Pattern.compile("EDIT\\s+\\d+\\s*.*");
    Pattern delete = Pattern.compile("DELETE\\s+\\d+\\s*");
    Pattern list = Pattern.compile("LIST\\s*");
    Pattern help = Pattern.compile("HELP\\s*");
    Pattern exit = Pattern.compile("EXIT\\s*");

    while (true) {
      System.out.println("Введите команду.");
      setInputText();
      Matcher addMatcher = add.matcher(inputText);
      Matcher addIndexMatcher = addIndex.matcher(inputText);
      Matcher editMatcher = edit.matcher(inputText);
      Matcher deleteMatcher = delete.matcher(inputText);
      Matcher listMatcher = list.matcher(inputText);
      Matcher helpMatcher = help.matcher(inputText);
      Matcher exitMatcher = exit.matcher(inputText);
      int inputIndex;
      if (addIndexMatcher.matches()) { // Добавление дела по индексу
        inputText = inputText.replaceFirst("ADD\\s+", "");
        inputIndex = Integer.parseInt(inputText.replaceFirst("[^\\d].*", ""));
        inputText = inputText.replaceFirst("\\d+\\s+", "");
        todoList.add(inputIndex, inputText);
        System.out.println(inputText.length() == 0 ? "Дело не добавлено" : "Добавлено дело " + inputText);
      } else if (addMatcher.matches()) { // Добавление дела
        inputText = inputText.replaceFirst("ADD\\s*", "");
        todoList.add(inputText);
        System.out.println(inputText.length() == 0 ? "Дело не добавлено" : "Добавлено дело " + inputText);
      } else if (editMatcher.matches()) { // Замена дела по индексу
        if (!todoList.getTodos().isEmpty()) {
          inputText = inputText.replaceFirst("EDIT\\s+", "");
          inputIndex = Integer.parseInt(inputText.replaceFirst("[^\\d].*", ""));
          inputText = inputText.replaceFirst("\\d+\\s+", "");
          todoList.edit(inputText, inputIndex);
          System.out.println(inputIndex <= todoList.getTodos().size() ? "Дело - " + todoList.getListOfOldCases() + " заменено на - " + inputText : "");
        } else {
          System.out.println("Список дел пуст");
        }
      } else if (deleteMatcher.matches()) { // Удаление дела
        if (!todoList.getTodos().isEmpty()) {
          inputText = inputText.replaceFirst("DELETE\\s+", "");
          inputIndex = Integer.parseInt(inputText.replaceFirst("[^\\d].*", ""));
          todoList.delete(inputIndex);
          System.out.println(inputIndex <= todoList.getTodos().size() ? "Дело - " + todoList.getListOfOldCases() + " удалено" : "");
        } else {
          System.out.println("Список дел пуст");
        }
      } else if (listMatcher.matches()) { // Вывод списка дел
        System.out.println((todoList.getTodos().isEmpty()) ? "Список дел пуст" : "");
        for (int i = 0; i < todoList.getTodos().size(); i++) {
          System.out.println(i + " - " + todoList.getTodos().get(i));
        }
      } else if (helpMatcher.matches()) { // Вывод пунктов меню
        System.out.println(INPUT_ITEMS);
      } else if (exitMatcher.matches()) { // выход из программы
        break;
      } else {
        System.out.println("Команда не распознана" + "\n");
      }
    }
  }

  private static void setInputText() {
    Scanner scanner = new Scanner(System.in);
    inputText = scanner.nextLine();
  }
}
