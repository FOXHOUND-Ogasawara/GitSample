package Sample;
/*
 * 1から100の数字のうち、3の倍数と3の付く数字のときだけ「！」を付けて出力してください。
 */
public class Nabeatsu {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (containsThree(i) || isMultipleOfThree(i)) {
                System.out.print(i + "!");
            } else {
                System.out.print(i);
            }

            if (i != 100) {
                System.out.print(", ");
            }
        }
    }

    public static boolean containsThree(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 3) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}