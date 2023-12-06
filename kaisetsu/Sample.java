package kaisetsu;
class Sample {
    public static void main(String[] args) {
        // 1. 縦と横の変数を用意する
        int width = 5;
        int height = 5;
        // 2. 0を出力する箇所を決める変数を用意する
        int start = (width - 1) / 2;
        int end = start;

        // 3. 出力処理を書く
        // 3-1. 高さ分繰り返す
        for (int i = 0; i < height; i++) {
            System.out.print("i = " + i + ",");
            System.out.print("start:" + start + ",end:" + end + " ");
            // 3-2. 横幅分繰り返す
            for (int j = 0; j < width; j++) {

                // 3-3. 出力する条件を書く
                if (j >= start && j <= end) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            // 3-4. 次の高さに移った時の出力カウンタを操作する
            if (i < (height - 1) / 2) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
        }
    }
}
