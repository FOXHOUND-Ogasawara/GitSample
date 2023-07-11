package CardGame_Review_Prylypa;

class Playing {
    public static void main(String[] args) {
        // 先のクラスにはthrows をよく使ったため、trycatch 必要
        int possessionCoin = 100;// スタートポイント
        String userName = "";// ユーザー名
        String msg = "";// ゲーム終了のメッセージ
        System.out.println("Welcome");// 最初の挨拶
        System.out.println("Please enter your name:");// ユーザー名を聞く
        userName = GameUtils.getInputString();
        System.out.println(userName);
        while (!GameUtils.checkPattern(userName)) {// 繰り返し案件
            System.out.println("Does not match condition of the username");
            userName = GameUtils.getInputString();// 入力習得
        }

        System.out.println("Hello " + userName);// 個人的な挨拶
        CardPickGame cpg = new CardPickGame(possessionCoin);// ゲームのクラス初期化
        possessionCoin = cpg.execute(); // ゲームを起動

        if (possessionCoin == 0) {
            msg = "You run out of coins: ";
        } else if (possessionCoin > 0) {
            msg = "Your result: " + possessionCoin + "coins";
        } else {
            return; // ゼロ以下の数字はエラー管理ため。
        }
        System.out.println(msg);

    }
}