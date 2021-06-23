import java.util.ArrayList;

public class TodoList {
  private final ArrayList<String> todoList = new ArrayList<>();

  public void add(String todo) {
    // TODO: добавьте переданное дело в конец списка
    todoList.add(todo);
  }

  public void add(int index, String todo) {
    // TODO: добавьте дело на указаный индекс,
    //  проверьте возможность добавления
    if (index < 0) {
      System.out.println("Нельзя вводить дело с отрицательным индексом");
    } else {
      index = Math.min(index, todoList.size());
      todoList.add(index, todo);
    }
  }

  public void edit(String todo, int index) {
    // TODO: заменить дело на index переданным todo индекс,
    //  проверьте возможность изменения
    if (index >= todoList.size() || index < 0) {
      System.out.println("Дело с таким номером - " + index + " не существует");
    } else {
      todoList.set(index, todo);
    }
  }

  public void delete(int index) {
    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
    if (index >= todoList.size() || index < 0) {
      System.out.println("Дело с номером - " + index + " не существует");
    } else {
      todoList.remove(index);
    }
  }

  public ArrayList<String> getTodos() {
    // TODO: вернуть список дел
    return todoList;
  }

}