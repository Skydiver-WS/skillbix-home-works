import java.util.*;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {
      HashSet<String> notDuplicateNumber = new HashSet<>();
    String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    while (notDuplicateNumber.size() < 2000000) {
      String number = "";
      String firstLetters = letters[(int) (Math.random() * 12)];
      for (int i = 0; i < 3; i++) {
        number += numbers[(int) (Math.random() * 10)];
      }
      String secondLetters = letters[(int) (Math.random() * 12)] + letters[(int) (Math.random() * 12)];
      int regionNumber = 1 + (int) (Math.random() * (199 - 1));
      String regionNumberStr = regionNumber < 10 ? "0" + regionNumber : String.valueOf(regionNumber);
      notDuplicateNumber.add(String.format("%s%s%s%s", firstLetters, number, secondLetters, regionNumberStr));
    }
      return new ArrayList<>(notDuplicateNumber);
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {
    return list.contains(number);
  }

  public static boolean binarySearchInList(List<String> sortedList, String number) {
    Collections.sort(sortedList);
    int index = Collections.binarySearch(sortedList, number);
    return index >= 0;
  }


  public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
    return hashSet.contains(number);
  }

  public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
    return treeSet.contains(number);
  }

}