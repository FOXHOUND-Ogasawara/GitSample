public class IfKaisetsu {
    public static void main(String[] args) {
        int num = 5;

        // 単体で使う
        if (num == 5) {
            System.out.println("5です");
        }

        // 条件を分岐させる その１
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else if (num % 2 == 1) {
            System.out.println("奇数");
        }

        // 条件を分岐させる その２
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        // いくつも連結させることも可能
        if (num == 5) {
            System.out.println("5です");
        } else if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

    }

}
