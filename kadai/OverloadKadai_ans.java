package kadai;
public class OverloadKadai_ans {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int sum1 = add(num1, num2); // オーバーロードされたメソッドを使用して和を計算

        double double1 = 2.5;
        double double2 = 3.7;

        double sum2 = add(double1, double2); // オーバーロードされたメソッドを使用して和を計算

        System.out.println("整数の和: " + sum1);
        System.out.println("小数の和: " + sum2);
    }

    // 2つの整数の和を計算するオーバーロードされたメソッド
    public static int add(int a, int b) {
        return a + b;
    }

    // 2つの小数の和を計算するオーバーロードされたメソッド
    public static double add(double a, double b) {
        return a + b;
    }
}