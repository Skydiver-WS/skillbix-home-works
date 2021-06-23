public class Main {
  private static TodoList todoList = new TodoList();
  private static String oldOfItemList;

  public static void main(String[] args) {
    // TODO: написать консольное приложение для работы со списком дел todoList

    todoList.add("Дело один");
    System.out.println("Добавлено дело " + todoList.getTodos().get(0));
    todoList.add(1, "Дело два");
    System.out.println("Добавлено дело " + todoList.getTodos().get(1));
    todoList.add("Дело три");
    System.out.println("Добавлено дело " + todoList.getTodos().get(2));
    todoList.add(5, "Дело четыре");
    System.out.println("Добавлено дело " + todoList.getTodos().get(3) + "\n");

    for (int i = 0; i < todoList.getTodos().size(); i++) {
      System.out.println(i + " - " + todoList.getTodos().get(i));
    }

    oldOfItemList = todoList.getTodos().get(2);
    todoList.edit("Дело десять", 2);
    System.out.println("Дело - " + oldOfItemList + " заменено на - " + todoList.getTodos().get(2));
    oldOfItemList = todoList.getTodos().get(0);
    todoList.delete(0);
    System.out.println("Дело -" + oldOfItemList + " удалено\n");
    todoList.delete(100);

    for (int i = 0; i < todoList.getTodos().size(); i++) {
      System.out.println(i + " - " + todoList.getTodos().get(i));
    }
  }
}
