package kaisetsu.Hanoi;
/**
 * ハノイの塔
 *
 * 円盤 4枚の時
 *
 * 1 | I | | |
 * 2 | J | | |
 * 3 | K | | |
 * 4 | L | | |
 * -------------- -------------- --------------
 * A B C
 * start tmp gaol
 *
 * 1 | | | I |
 * 2 | | | J |
 * 3 | | | K |
 * 4 | | | L |
 * -------------- -------------- --------------
 * A B C
 * start tmp gaol
 */
public class Hanoi {
    public char start = 'A'; // スタートの棒の変数
    public char tmp = 'B'; // 一時移動先の棒の変数
    public char goal = 'C'; // ゴールの棒の変数
    public int[] disks;
    public long moveCount = 0; // 移動回数

    // 以下に円盤を移動する処理メソッドを追加する
    public Hanoi() {
        disks = new int[8];
        for (int i = 1; i < disks.length; i++) {
            disks[i] = i;
        } // 円盤が 4 枚時の名前
    }

    public void moveDisk(int num, char start, char goal, char tmp) {
        // 0 枚目というのは存在しないので、0 になるまで再帰処理を繰り返します
        if (num > 0) {
            moveDisk((num - 1), start, tmp, goal); // 円盤が 4 枚のとき 3 枚目までを A → B に動かす
            System.out.println(this.disks[num - 1] + " の板を "
                    + start + " から " + goal + " に移動 "); // 4 枚目を A → C に動かす
            this.moveCount++;
            moveDisk((num - 1), tmp, goal, start); // 3 枚目までを B → C に動かす
        }
    }
}