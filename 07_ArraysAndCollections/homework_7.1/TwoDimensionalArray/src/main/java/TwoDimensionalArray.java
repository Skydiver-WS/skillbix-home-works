public class TwoDimensionalArray {
  public static char symbol = 'X';

  public static char[][] getTwoDimensionalArray(int size) {
    char[][] multiArray = new char[size][size];
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        if (i + j == multiArray.length - 1 || (i + j) == j * 2) {
          multiArray[i][j] = symbol;
        } else {
          multiArray[i][j] = ' ';
        }
      }
    }
    //TODO: Написать метод, который создаст двумерный массив char заданного размера.
    // массив должен содержать символ symbol по диагоналям, пример для size = 3
    // [X,  , X]
    // [ , X,  ]
    // [X,  , X]
    return multiArray;
  }
}
