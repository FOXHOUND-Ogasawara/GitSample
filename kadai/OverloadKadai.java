public class OverloadKadai_yamasakihiromi {
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

    // これ以下にオーバーロードを利用してメソッドを記述してください
    // mainメソッドは変更してはいけません
    public static int add(int num1, int num2){
      return num1 + num2 ;
    }

    public static double add(double double1, double double2){
      return double1 + double2 ;
    }


}