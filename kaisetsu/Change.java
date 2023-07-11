package kaisetsu;

public class Change {
    public static void main(String[] args) {
        // 数値リテラルはアンダースコアを入れて桁の可読性を良くすることが出来る
        int deposit = 10_000; // 10000 と同等
        int amount = 3_214; // 3214 と同等

        // 以下に処理を追加する
        int change = deposit - amount;

        // 金額の表示をしたい場合、String の format メソッドを利用すると出力時に任意の形式で表示できます
        System.out.println("合計金額 : " + String.format("%,d", amount)
                + "円 預り金 : " + String.format("%,d", deposit)
                + "円 おつり : " + String.format("%,d", change) + "円");

        int[] money = {10_000, 5_000, 1_000, 500, 100, 50, 10, 5, 1}; // 紙幣と硬貨の情報
        boolean[] isCoin = {false, false, false, true, true, true, true, true, true}; // 紙幣か硬貨かの情報
        int[] nums = new int[money.length]; // 枚数の情報

        // お釣りの枚数計算処理
        for (int i = 0; i < money.length; i++) {
            nums[i] = change / money[i];
            change %= money[i];
        }

        String bill = "円札";
        String coin = "円硬貨";
        // 文字列を結合するときは String より StringBuilder の方が処理速度が高速です
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < money.length; i++) {
            // append メソッドで文字列追加
            result.append(String.format("%,d", money[i]));
            if (isCoin[i]) {
                result.append(coin);
            } else {
                result.append(bill);
            }
            System.out.println(result.append(" : " + nums[i] + "枚"));
            // 中身を初期化する
            result.delete(0, result.length());
        }
    }
}