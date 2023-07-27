package classKadai072502;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();

        if (PalindromeChecker.isPalindrome(input)) {
            System.out.println("入力された文字列はパリンドロームです。");
        } else {
            System.out.println("入力された文字列はパリンドロームではありません。");
        }

        scanner.close();
    }
}
