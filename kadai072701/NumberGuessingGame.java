package kadai072701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) throws IOException {
        System.out.println("=== 数当てゲーム ===");
        System.out.println("1から100までの数を当ててください。");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0; // 試行回数
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("予想した数を入力してください: ");
            String input = reader.readLine();

            int guess;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。数値を入力してください。");
                continue;
            }

            attempts++;

            if (guess < secretNumber) {
                System.out.println("秘密の数よりも小さいです。");
            } else if (guess > secretNumber) {
                System.out.println("秘密の数よりも大きいです。");
            } else {
                System.out.println("正解です！当たりです！");
                break;
            }
        }

        System.out.println("おめでとうございます！" + attempts + "回で当たりました！");
    }
}
