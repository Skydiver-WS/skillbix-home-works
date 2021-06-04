public class ReverseArray {
  //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
  public static String[] reverse(String[] strings) {
    for (int i = 0; i < strings.length / 2; i++) {
      String revers = strings[i]; // получение содержания строки по номеру
      System.out.println(revers + " " + i);
      strings[i] = strings[strings.length - i - 1]; // присваивание нового номера в строке. strings[i] похоже служит для инициализации и не более
      strings[strings.length - i - 1] = revers; // окончательный возврат строки и перемещение её в новую ячейку
    }
    return strings;
  }
}
