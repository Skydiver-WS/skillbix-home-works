import java.util.ArrayList;

public class TodoList {
  private final ArrayList<String> todoList = new ArrayList<>();
  private String listOfOldCases;

  public void add(String todo) {
    // TODO: добавьте переданное дело в конец списка
    todoList.add(todo);
  }

  public void add(int index, String todo) {
    // TODO: добавьте дело на указаный индекс,
    //  проверьте возможность добавления
    index = Math.min(index, todoList.size());
    todoList.add(index, todo);
  }

  public void edit(String todo, int index) {
    // TODO: заменить дело на index переданным todo индекс,
    //  проверьте возможность изменения
    if (index >= todoList.size() || index < 0) {
      System.out.println("Дело с таким номером - " + index + " не существует");
    } else {
      listOfOldCases = todoList.get(index);
      todoList.set(index, todo);
    }
  }

  public void delete(int index) {
    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
    if (index >= todoList.size() || index < 0) {
      System.out.println("Дело с номером - " + index + " не существует");
    } else {
      listOfOldCases = todoList.get(index);
      todoList.remove(index);
    }
  }

  public ArrayList<String> getTodos() {
    // TODO: вернуть список дел
    return todoList;
  }

  public String getListOfOldCases() {
    return listOfOldCases;
  }
}