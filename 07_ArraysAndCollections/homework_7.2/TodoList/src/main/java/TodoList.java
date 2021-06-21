import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
  private final ArrayList<String> todoList = new ArrayList<>();
  private String inputText;
  private String listOfOldCases;
  private int inputIndex;
  private int amountCases = inputIndex + 1;
  private final static String INPUT_ITEMS = "To add to case, press 1 and press Enter." +
    "\nTo add a case by index, press 2 and press Enter." +
    "\nTo replace the case, press 3 and press Enter." +
    "\nTo delete a case, press 4 and press Enter." +
    "\nTo display the to-do list, press 5 and press Enter." +
    "\nTo display the menu, press * and press Enter." +
    "\nTo exit program, press 0 and press Enter";

  public void setTodoList() {
    System.out.println(INPUT_ITEMS);
    label:
    // метка, почитать про switch/case, неплохая замена if при необходимости выбора пунктов
    while (true) {
      System.out.println("Select an item.");
      setInputText();
      switch (inputText) {
        case "1": // Добавление дела
          System.out.println("Enter a cases, and press enter");
          setInputText();
          add(inputText);
          break;
        case "2": // Добавление дела по индексу
          System.out.println("Enter case index, and press enter");
          setInputIndex();
          if (inputIndex > 0) {
            System.out.println("Enter a cases, and press enter");
            setInputText();
          }
          add(inputIndex, inputText);
          break;
        case "3": // Замена дла по индексу
          if (!todoList.isEmpty()) {
            System.out.println("Enter the index of the cases to replace, and press enter" + "\n");
            setInputIndex();
            listOfOldCases = todoList.get(inputIndex);
          }
          if (inputIndex < todoList.size() && inputIndex >= 0) {
            System.out.println("Enter a new case, and press enter");
            setInputText();
          }
          edit(inputText, inputIndex);
          break;
        case "4": // Удаление дела
          System.out.println("Enter the index of the case to delete, and press enter");
          setInputIndex();
          listOfOldCases = todoList.get(inputIndex);
          delete(inputIndex);
          break;
        case "5": // Вывод списка дел
          System.out.println((todoList.isEmpty()) ? "Cases not found" : "");
          int count = 1;
          for (String text : todoList) {
            System.out.println((count++) + " - " + text);
          }
          break;
        case "*": // Вывод пунктов меню
          System.out.println(INPUT_ITEMS);
          break;
        case "0": // выход из программы
          break label;
        default:
          System.out.println("Command not recognized" + "\n");
          break;
      }
    }
  }

  //=============================================================================================================================================================
  public void add(String todo) {
    // TODO: добавьте переданное дело в конец списка
    todoList.add(todo);
    System.out.println("Cases number " + (amountCases++) + " - " + todo + " input successful" + "\nAmount cases: " + todoList.size() + "\n");
  }

  public void add(int index, String todo) {
    // TODO: добавьте дело на указаный индекс,
    //  проверьте возможность добавления
    if (index < 0) {
      System.out.println("Index not found." + "\n");
    } else {
      index = Math.min(index, todoList.size());
      todoList.add(index, todo);
      System.out.println("Cases №" + (amountCases++) + " - " + todo + " input successful" + "\nAmount cases: " + todoList.size() + "\n");
    }
  }

  public void edit(String todo, int index) {
    // TODO: заменить дело на index переданным todo индекс,
    //  проверьте возможность изменения
    if (index >= todoList.size() || index < 0) {
      System.out.println("Index not found." + "\n");
    } else {
      todoList.set(index, todo);
      System.out.println("Cases №" + (index + 1) + " - " + listOfOldCases + " replaced by " + todo + " successful" + "\nAmount cases: " + todoList.size() + "\n");
    }
  }

  public void delete(int index) {
    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
    if (index >= todoList.size() || index < 0) {
      System.out.println("Index not found." + "\n");
    } else {
      todoList.remove(index);
      System.out.println("Cases №" + (index + 1) + " - " + listOfOldCases + " delete successful" + "\nAmount cases: " + todoList.size() + "\n");
    }
  }

  private void setInputText() {
    Scanner scanner = new Scanner(System.in);
    inputText = scanner.nextLine();
  }

  private void setInputIndex() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      if (scanner.hasNextInt()) {
        inputIndex = scanner.nextInt() - 1;
        break;
      } else {
        System.out.println("The entered value is not a number. Entered the number.");
      }
    }
  }

  public ArrayList<String> getTodos() {
    // TODO: вернуть список дел
    return todoList;
  }

}