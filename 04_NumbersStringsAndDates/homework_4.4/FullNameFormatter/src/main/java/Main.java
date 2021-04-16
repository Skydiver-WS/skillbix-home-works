import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    while (true)
    {
      String input = scanner.nextLine();
      int firstSpace = input.trim().indexOf(' ');
      int lastSpace = input.trim().lastIndexOf(' ');
      char ch;
      int spaceCount = 0;
      boolean stopCycle = true;
      for (int i = 0; i < input.trim().length(); i++)
      {
        ch = input.charAt(i);
        if (Character.isDigit(ch))
        {
          stopCycle = false;
          break;
        }
        else if (Character.isSpaceChar(ch))
        {
          spaceCount++;
        }
      }
        //TODO:напишите ваш код тут, результат вывести в консоль.
        //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
        if (spaceCount == 2 && stopCycle)
        {
          System.out.println("Фамилия: " + input.substring(0, firstSpace).trim() + "\n" + "Имя: " + input.substring(firstSpace, lastSpace).trim()
                  + "\n" + "Отчество: " + input.substring(lastSpace).trim());
          break;
        }
        else
        {
          System.out.println("Введенная строка не является ФИО");
          break;
        }
 //     }
    }
  }
}