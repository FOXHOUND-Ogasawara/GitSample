package Sample;
public class Rei2 {
    public static void main(String[] args) {
        int[][][] numberList = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                },
                {
                        { 10, 11, 12 },
                        { 13, 14, 15 }
                },
                {
                        { 16, 17, 18 },
                        { 19, 20, 21 }
                }
        };

        for (int i = 0; i < numberList.length; i++) {
            for (int j = 0; j < numberList[i].length; j++) {
                for (int k = 0; k < numberList[i][j].length; k++) {
                    System.out.print(numberList[i][j][k] + " ");
                }
            }
        }
    }
}
