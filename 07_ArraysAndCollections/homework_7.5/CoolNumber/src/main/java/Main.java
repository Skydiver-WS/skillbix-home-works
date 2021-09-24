import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

  public static void main(String[] args) {
    ArrayList<String> carNumberList = new ArrayList<>(CoolNumbers.generateCoolNumbers());
    System.out.println(carNumberList);
    for (int i = 0; i < 5; i++) {
      String inputSearchNumber = carNumberList.get(1 + (int) (Math.random() * (carNumberList.size() - 1)));
      var oneTestStart = System.nanoTime();
      String testOne = CoolNumbers.bruteForceSearchInList(carNumberList, inputSearchNumber) ? "Поиск перебором: номер найден, " : "Поиск перебором: номер не найден, ";
      var oneTestEnd = System.nanoTime();
      //============================================================================================================================================================
      var twoTestStart = System.nanoTime();
      String testTwo = CoolNumbers.binarySearchInList(carNumberList, inputSearchNumber) ? "Бинарный поиск: номер найден, " : "Бинарный поиск: номер не найден, ";
      var twoTestEnd = System.nanoTime();
      //============================================================================================================================================================
      var treeTestStart = System.nanoTime();
      String testTree = CoolNumbers.searchInHashSet(new HashSet<>(carNumberList), inputSearchNumber) ? "Поиск в HashSet: номер найден, " : "Поиск в HashSet: номер не найден, ";
      var treeTestEnd = System.nanoTime();
      //============================================================================================================================================================
      var fourTestStart = System.nanoTime();
      String testFour = CoolNumbers.searchInTreeSet(new TreeSet<>(carNumberList), inputSearchNumber) ? "Поиск в TreeSet: номер найден, " : "Поиск в TreeSet: номер не найден, ";
      var fourTestEnd = System.nanoTime();
      //============================================================================================================================================================
      var resultTestOne = oneTestEnd - oneTestStart;
      var resultTestTwo = twoTestEnd - twoTestStart;
      var resultTestTree = treeTestEnd - treeTestStart;
      var resultTestFour = fourTestEnd - fourTestStart;

      System.out.println(testOne + "занял " + resultTestOne + "нс" + "\n" +
        testTwo + "занял  " + resultTestTwo + "нс" + "\n" +
        testTree + "занял " + resultTestTree + "нс" + "\n" +
        testFour + "занял " + resultTestFour + "нс" + "\n" +
        Math.max(resultTestOne, Math.max(resultTestTwo, Math.max(resultTestTree, resultTestFour))) + "\n" +
        Math.min(resultTestOne, Math.min(resultTestTwo, Math.min(resultTestTree, resultTestFour))) + "\n");
    }
    searchUnkmnownNumber(carNumberList);
  }

  public static void searchUnkmnownNumber(List<String> carNumberList) {
    System.out.println("Введите номер для поиска");
    Scanner scanner = new Scanner(System.in);
    String inputSearchNumber = scanner.nextLine();
    var oneTestStart = System.nanoTime();
    String testOne = CoolNumbers.bruteForceSearchInList(carNumberList, inputSearchNumber) ? "Поиск перебором: номер найден, " : "Поиск перебором: номер не найден, ";
    var oneTestEnd = System.nanoTime();
    //============================================================================================================================================================
    var twoTestStart = System.nanoTime();
    String testTwo = CoolNumbers.binarySearchInList(carNumberList, inputSearchNumber) ? "Бинарный поиск: номер найден, " : "Бинарный поиск: номер не найден, ";
    var twoTestEnd = System.nanoTime();
    //============================================================================================================================================================
    var treeTestStart = System.nanoTime();
    String testTree = CoolNumbers.searchInHashSet(new HashSet<>(carNumberList), inputSearchNumber) ? "Поиск в HashSet: номер найден, " : "Поиск в HashSet: номер не найден, ";
    var treeTestEnd = System.nanoTime();
    //============================================================================================================================================================
    var fourTestStart = System.nanoTime();
    String testFour = CoolNumbers.searchInTreeSet(new TreeSet<>(carNumberList), inputSearchNumber) ? "Поиск в TreeSet: номер найден, " : "Поиск в TreeSet: номер не найден, ";
    var fourTestEnd = System.nanoTime();
    //============================================================================================================================================================
    var resultTestOne = oneTestEnd - oneTestStart;
    var resultTestTwo = twoTestEnd - twoTestStart;
    var resultTestTree = treeTestEnd - treeTestStart;
    var resultTestFour = fourTestEnd - fourTestStart;

    System.out.println(testOne + "занял " + resultTestOne + "нс" + "\n" +
      testTwo + "занял  " + resultTestTwo + "нс" + "\n" +
      testTree + "занял " + resultTestTree + "нс" + "\n" +
      testFour + "занял " + resultTestFour + "нс" + "\n" +
      Math.max(resultTestOne, Math.max(resultTestTwo, Math.max(resultTestTree, resultTestFour))) + "\n" +
      Math.min(resultTestOne, Math.min(resultTestTwo, Math.min(resultTestTree, resultTestFour))) + "\n");
  }
}
