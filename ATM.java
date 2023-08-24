import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class ATM {

    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private static final int MIN_DEPOSIT_AMOUNT = 1;
    private static final int MAX_DEPOSIT_AMOUNT = 2000000;
    private static final int MIN_WITHDRAWAL_AMOUNT = 1;
    private static final int MAX_WITHDRAWAL_AMOUNT = 500000;

    private Map<Integer, String> menu = new HashMap<Integer, String>();

    private Map<String, String> user = new HashMap<String,String>();

    public ATM() {
        menu.put(1, "預け入れ");
        menu.put(2, "引き出し");
        menu.put(3, "残高照会");
        menu.put(4, "終了");
    }

    //メニュー表示
    private void showMenu(Map<Integer, String> menu) {
        menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
        System.out.println();
    }

    //メニュー番号入力
    private int inputMenu(Map<Integer, String> menu) {
        while (true) {
            this.showMenu(menu);
            int input = this.inputNum();

            if (input > 0 && input <= menu.size()) {
                return input;
            }

            System.out.println("該当する半角数字で入力してください");
        }
    }

    //数字入力
    private int inputNum() {
        try {
            return Integer.parseInt(BR.readLine());
        } catch (NumberFormatException | IOException e) {
            return 0;
        }
    }

    //メニュー選択
    public Map<String, String> selectMenu() {
        System.out.println(this.user.get("name")+ "様ようこそ");
        boolean isFinished = true;
        while (isFinished) {
            int inputMenu = this.inputMenu(menu);
            switch (inputMenu) {
                case 1:
                    this.deposit();
                    break;
                case 2:
                    this.withdrawal();
                    break;
                case 3:
                    this.balanceInquiry();
                    break;
                case 4:
                    System.out.println("ATM のご利用ありがとうございました");
                    isFinished = false;
                    break;
            }
        }
        return this.user;
    }

    private void balanceInquiry(){
        System.out.println("残高は" + this.user.get("balance") + "円です");
    }

    //預け入れ
    private void deposit(){
        int amount = -1;
        while(true){
            System.out.println("ご入金額を入力してください");
            amount = this.inputNum();
            if(amount >= MIN_DEPOSIT_AMOUNT && amount <= MAX_DEPOSIT_AMOUNT){
                break;
            }
            System.out.println(MIN_DEPOSIT_AMOUNT + "円から" + (MAX_DEPOSIT_AMOUNT / 10000) + "万円以内で入力してください");
        }
        // userのbalanceを修正するがString型なのでintで計算してまたStringに戻してから格納する
        this.user.replace("balance", String.valueOf(Integer.parseInt(this.user.get("balance")) + amount));
        System.out.println(amount + "円お預かりしました");
    }

    //引き出し
    private void withdrawal(){
        // 何度もint型に変換する処理をしないためローカル変数に格納して使う
        int balance = Integer.parseInt(this.user.get("balance"));
        if(balance <= 0){
            System.out.println("残高がありません");
            return;
        }

        int amount = -1;
        while(true){
            System.out.println("ご出金額を入力してください");
            amount = this.inputNum();
            if(amount <MIN_WITHDRAWAL_AMOUNT || amount > MAX_WITHDRAWAL_AMOUNT){
                System.out.println(MIN_WITHDRAWAL_AMOUNT + "円から" + (MAX_WITHDRAWAL_AMOUNT / 10000) +  "万円以内で入力してください");
                continue;
            }
            if(amount <= balance){
                break;
            }
            System.out.println("残高が不足しています、残高は" + this.user.get("balance") + "円です");
        }
        System.out.println(amount + "円お返ししました");
        //userのbalanceを修正するがString型なのでintで計算してまたStringに戻してから格納する
        this.user.replace("balance", String.valueOf(balance - amount));
    }

    //ユーザー情報セット
    public void setUser(Map<String,String> user){
        this.user = user;
    }
}