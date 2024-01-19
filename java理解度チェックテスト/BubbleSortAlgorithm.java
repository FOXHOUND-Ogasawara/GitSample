package java理解度チェックテスト;
import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        // ステップ1: 配列を宣言する
        int[] array = {7, 3, 10, 5, 1};

        // ステップ2: 2重ループを使用する
        for (int outer = 0; outer < array.length - 1; outer++) {
            for (int i = array.length - 1; i > outer; i--) {
                // ステップ3: 内側のループの処理
                // ステップ3-1: 比較してarray[i]がarray[i - 1]より小さい場合
                if (array[i] < array[i - 1]) {
                    // ステップ3-2: tmpにarray[i]を代入
                    int tmp = array[i];
                    // ステップ3-3: array[i]にarray[i - 1]を代入
                    array[i] = array[i - 1];
                    // ステップ3-4: array[i - 1]にtmpを代入
                    array[i - 1] = tmp;
                }
            }
        }

        // ステップ4: ソート後の配列を出力する
        System.out.println(Arrays.toString(array));
    }
}