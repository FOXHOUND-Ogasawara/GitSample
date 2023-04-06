package Constructor;

public class Constructor {
    public static void main(String[] args) {
        // パターン 1 は引数なしのコンストラクタを使用する
        Calculation calc = new Calculation();
        System.out.println("パターン1");
        System.out.println(calc.getNum1() + " + " + calc.getNum2() + " = " + (calc.num1 + calc.num2));

        // パターン 2 は引数が 1 つのコンストラクタを使用する
        Calculation calc2 = new Calculation(20);
        System.out.println("パターン2");
        calc2.num1 = 30;
        System.out.println(calc2.num1 + " + " + calc2.num2 + " = " + (calc2.num1 + calc2.num2));

        // パターン 3 は引数が 2 つのコンストラクタを使用する
        Calculation calc3 = new Calculation(30, 15);
        System.out.println("パターン3");
        System.out.println(calc3.num1 + " + " + calc3.num2 + " = " + (calc3.num1 + calc3.num2));
    }
}
