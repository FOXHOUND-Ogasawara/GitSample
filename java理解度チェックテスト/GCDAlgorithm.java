package java理解度チェックテスト;
public class GCDAlgorithm {
    public static void main(String[] args) {
        // ステップ1: 2つの整数 num1 = 722, num2 = 171を用意する
        int num1 = 722;
        int num2 = 171;

        // ステップ2: num2が0でない限り以下の処理を繰り返す
        while (num2 != 0) {
            // ステップ2-1: 変数 num3 を用意し num1 と num2 の剰余算の結果を代入する
            int num3 = num1 % num2;

            // ステップ2-2: num1 に num2 を代入し、num2 に num3 を代入する
            num1 = num2;
            num2 = num3;
        }

        // ステップ3: num1 を answer に代入して出力をする
        int answer = num1;
        System.out.println("最大公約数は: " + answer);
    }
}