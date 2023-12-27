package Java確認テスト1模範解答;

public class Test1AAnswer {

  public static void main(String args[]) {
    // Q1 条件文
    int number7 = 10;
    int number8 = 8;
    int differenceNumber = number7 - number8;

    switch (differenceNumber % 2) {
      case 0:
        System.out.println("偶数か0です");
        break;
      default:
        System.out.println("奇数です");
    }

    // Q2 for文と条件式の組み合わせ
    int count = 0;
    for (int i = 20; i <= 50; i++) {
      if ((i % 2) == 0 && (i / 2) % 2 == 1) {
        count++;
      }
    }
    System.out.println(count + "個");

    // Q3 for文を利用した計算
    int countQ3 = 0;
    for (int i = 999; i > 0; i--) {
      if (i % 3 == 0 || i % 7 == 0) {
        countQ3++;

        if (countQ3 == 5) {
          System.out.println(i);
          break;
        }
      }
    }

    // Q4 lengthの利用
    int[][][] numberList = {
      { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
      { { 10, 11, 12 }, { 13, 14, 15 } },
      { { 16, 17, 18 }, { 19, 20, 21 } },
    };

    for (int i = 0; i < numberList.length; i++) {
      for (int j = 0; j < numberList[i].length; j++) {
        for (int k = 0; k < numberList[i][j].length; k++) {
          System.out.print(numberList[i][j][k] + " ");
        }
      }
    }
    System.out.println();

    // Q5 図形描画
    int rowsQ5 = 5;
    int columnsQ5 = 11;

    for (int i = 0; i < rowsQ5; i++) {
      for (int j = 0; j < columnsQ5; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Q6図形描画2
    int rowsQ6 = 5;
    int columnsQ6 = 5;
    int startQ6 = rowsQ6 - columnsQ6;
    int endQ6 = columnsQ6;

    for (int i = 0; i < rowsQ6; i++) {
      for (int j = 0; j < columnsQ6; j++) {
        if (j >= startQ6 && j < endQ6) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
        // System.out.print((j >= startQ6 && j < endQ6) ? "0" : " ");
      }

      if (i >= (rowsQ6 - 1) / 2) {
        startQ6--;
        endQ6++;
      } else {
        startQ6++;
        endQ6--;
      }
      System.out.println();
    }
  }
}
