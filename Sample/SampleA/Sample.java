package SampleA;

public class Sample {

    public static void main(String[] args) {
        int number11 = 8;
        int number12 = 2;
        int differenceNumber = number11 - number12;

        // NG
        if (differenceNumber % 2 == 0) {
            System.out.println("偶数です");
        } else if (differenceNumber % 2 == 1) {
            System.out.println("奇数です");
        } else if (differenceNumber == 0) {
            System.out.println("0です");
        }

        // OK
        if (differenceNumber == 0) { // 先に0の確認を済ませる
            System.out.println("0です");
        } else if (differenceNumber % 2 == 0) {
            System.out.println("偶数です");
        } else { // 0と偶数の確認を済ませたあと残るのは奇数のみ
            System.out.println("奇数です");
        }
    }
}
