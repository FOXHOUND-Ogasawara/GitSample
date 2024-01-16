public class Sample2 {
    public static void main(String[] args) {

        // 描画範囲の設定
        int width = 10;
        int height = 10;

        // 縦横それぞれ描画範囲分繰り返し処理
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // 条件により描画する図形を変える
                // 条件：該当する行が該当する列以下の場合
                if (i + 1<= j) {
                    System.out.print("□");
                } else {
                    System.out.print("■");
                }
            }
            // 1行分の出力が終わったら次の行に移るため改行する
            System.out.println();
        }
    }

}
