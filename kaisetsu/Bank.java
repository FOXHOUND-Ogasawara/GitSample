import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class Bank {

    // 標準入力用
    // private static final BufferedReader BR = new BufferedReader(new
    // InputStreamReader(System.in));
    // メニュー情報
    private Map<Integer, String> menu = new HashMap<Integer, String>();
    // ATM型オブジェクト
    private ATM atm = new ATM(); // Q.ATM型(class型)という概念がいまいちよくわかってない
    // ユーザー情報
    private Map<String, String> user = new HashMap<String, String>();

    public Bank() {
        // ユーザー情報格納
        this.user.put("name", "taro");
        this.user.put("balance", "10000");
        // メニュー情報格納
        this.menu.put(1, "ATM 利用");
        this.menu.put(2, "終了");
    }

    // メニュー表示
    /*
     * private void showMenu(Map<Integer, String> menu) {
     * menu.forEach((key, value) -> {
     * System.out.print(key + ":" + value + " ");
     * });
     * System.out.println();
     * }
     *
     * //メニュー番号入力
     * private int inputMenu(Map<Integer, String> menu) {
     * while (true) {
     * this.showMenu(menu);
     * int input = this.inputNum();
     * //Q.このように関数の中で関数を呼び出す際、inputMenuを作るときにはもうinputNumはたまたselectMenuのことは想定しているのか？
     * またはinputMenuを作ってる最中にinputNumが必要だと気づいて途中からinputNumを作るのか？
     *
     * //1~4の範囲内か
     * if (input > 0 && input <= this.menu.size()) {
     * return input;
     * }
     * System.out.println("該当する半角数字で入力してください");
     * }
     * }
     *
     * //数字入力
     * private int inputNum() {
     * try {
     * return Integer.parseInt(BR.readLine());
     * } catch (NumberFormatException | IOException e) {
     * //NumberFormatExceptionが発生した場合 → 数値以外が入力されたと判断する
     * return 0;
     * }
     * }
     */

    // メニュー選択
    public void selectMenu() {
        System.out.println("いらっしゃいませ、ようこそ SLS銀行へ");
        boolean isFinished = true;
        while (isFinished) {
            // int inputMenu = this.inputMenu(this.menu);
            // CommonIOクラスのinputMenuメソッドを使用する
            int inputMenu = CommonIO.inputMenu(this.menu); // Q.CommonIOクラスのインスタンス生成しなくても使える？
            switch (inputMenu) {
                case 1:
                    this.useATM();
                    break;
                case 2:
                    System.out.println("ご利用ありがとうございました、またのご利用お待ちしております"); // 4 と入力があった場合は、ご利用ありがとうございました、またのご利用お待ちしております
                                                                          // と表示して処理を終了する。と問題文中に書いてあるが4ではなく2の誤り？
                    isFinished = false;
                    break;
            }
        }
    }

    // ATM利用
    private void useATM() { // Q.Bankクラスのフィールドにあるユーザー情報を ATM オブジェクトにセットして
                            // ATMクラスのメニュー選択処理を呼び出す。←なぜ以下の記述でこれが実現できるのか分からない
        // ATMにユーザー情報をセットする
        this.atm.setUser(this.user);
        // ATM利用終了後はフィールドのuserを上書き
        user = this.atm.selectMenu();
    }
}