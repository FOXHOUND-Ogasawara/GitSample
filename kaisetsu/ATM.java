package kaisetsu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

class ATM {
   //ATMのメニュー
   private Map<Integer, String> menu = new HashMap<Integer, String>();  //Q.問題文でpublic指定されているがなぜprivateなのか？
   //標準入力洋
   //private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); //Q.定数化する理由は？

   private Map<String, String> user = new HashMap<String, String>();

   // 預け入れ下限 1 円
   private static final int MIN_DEPOSIT_AMOUNT = 1;
   // 預け入れ上限 200 万円
   private static final int MAX_DEPOSIT_AMOUNT = 2000000;
   // 引き出し下限 1 円
   private static final int MIN_WITHDRAWAL_AMOUNT = 1;
   // 引き出し上限 50 万円
   private static final int MAX_WITHDRAWAL_AMOUNT = 500000;

   //ATMクラスのコンストラクタ(フィールドに初期値を設定する)
   public ATM() {
       this.menu.put(1, "預け入れ");
       this.menu.put(2, "引き出し");
       this.menu.put(3, "残高照会");
       this.menu.put(4, "終了");
   }

   //メニュー表示
   /*private void showMenu(Map<Integer, String> menu) {  //Q.なぜ引数にMapを指定しなければならないのか？また、引数にMapやclassを入れた場合のデータの挙動が分からないし、なぜここで引数を取るという思考になるのか？
       this.menu.forEach((key, value) -> {
           System.out.print(key + ":" + value + " ");
       });
       System.out.println();
   }

   //メニュー番号入力
   private int inputMenu(Map<Integer, String> menu) {  //Q.なぜ引数にMapを指定しなければならないのか？また、引数にMapやclassを入れた場合のデータの挙動が分からないし、なぜここで引数を取るという思考になるのか？
       while (true) {
           this.showMenu(menu);
           int input = this.inputNum();
           //1~4の範囲内か
           if (input > 0 && input <= this.menu.size()) {
               return input;  //Q.じゃんけんゲームはここでbreak,ATMがここでreturnでinputを返しているのは、フローチャートでその先の処理をswitch文で分岐させると書いてあるから？つまり実際の業務もフローチャートに従ってコードを書いていくということ？でなければ複数人でコードの整合性が取れなくなるよね？
           }
           System.out.println("該当する半角数字で入力してください");
       }
   }

   //数字入力
   private int inputNum() {
       try {
           return Integer.parseInt(BR.readLine());
       } catch (NumberFormatException | IOException e) {
           // NumberFormatExceptionが発生した場合 → 数値以外が入力されたと判断する
           return 0;
       }
   }*/

   //メニュー選択
   //public void selectMenu() {
   public Map<String, String> selectMenu() { //Map<String, String>を足してvoidを取ると何が起こるのか？
       //追加文
       System.out.println(this.user.get("name") + " 様ようこそ");
       boolean isFinished = true;
       while (isFinished) { //Q.ここを単にwhile(true)とせずにtrueを変数で表現するのは、case4のときだけfalseにしてwhile文を抜け、breakでswitch文を抜けるがまだwhile文の繰り返しは続くという認識でいい？
           //int inputMenu = this.inputMenu(menu);
           // CommonIOクラスのinputMenuメソッドを使用する
           int inputMenu = CommonIO.inputMenu(this.menu);
           switch (inputMenu) {
               case 1:
                   //預け入れ処理
                   this.deposit();
                   break;
               case 2:
                   //引き出し処理
                   this.withdrawal();
                   break;
               case 3:
                   //残高照会処理
                   this.balanceInquiry();
                   break;
               case 4:
                   System.out.println("ATM のご利用ありがとうございました");
                   isFinished = false;
                   break;
           }
       }
       //追加文
       return this.user;
   }

   // 残高照会  //Q.メソッドにしないでselectMenuメソッドのcase3の中にSystem.out.println("残高は " + this.balance + " 円です");表記ではダメなの？
   private void balanceInquiry() {
       //追加文
       System.out.println("残高は " + this.user.get("balance") + " 円です");
   }

   //預け入れ
   private void deposit() {
       int amount = -1;  //Q.なぜ-1とする必要があるのか？
       while (true) {
           System.out.println("ご入金額を入力してください");
           //amount = this.inputNum();
           // CommonIOクラスのinputNumメソッドを使用する
           amount = CommonIO.inputNum();
           if (amount >= MIN_DEPOSIT_AMOUNT && amount <= MAX_DEPOSIT_AMOUNT) {
               break;
           }
           System.out.println(MIN_DEPOSIT_AMOUNT + " 円から " + (MAX_DEPOSIT_AMOUNT / 10000) + " 万円以内で入力してください");
       }
       //this.balance += amount;
       //userのbalanceを修正するがString型なのでintで計算してまたStringに戻してから格納する
       this.user.replace("balance", String.valueOf(Integer.parseInt(this.user.get("balance")) + amount));
       System.out.println(amount + " 円お預かりしました");
   }

   //引き出し
   private void withdrawal() {
       //何度もint型に変換する処理をしないためローカル変数に格納して使う
       //追加文
       int balance = Integer.parseInt(this.user.get("balance"));
       //追加文
       if (balance <= 0) {
           System.out.println("残高がありません");
           return;
       }
       int amount = -1;
       while (true) {
           System.out.println("ご出金額を入力してください");
           //amount = this.inputNum();
           // CommonIOクラスのinputNumメソッドを使用する
           amount = CommonIO.inputNum();
           if (amount < MIN_WITHDRAWAL_AMOUNT || amount > MAX_WITHDRAWAL_AMOUNT) {
               System.out.println(MIN_WITHDRAWAL_AMOUNT + " 円から " + (MAX_WITHDRAWAL_AMOUNT / 10000) + " 万円以内で入力してください");  //Q.問題文には1 円から 200 万円以内で入力してくださいと出力するように書いてある
               continue;
           }
           //追加文
           if (amount <= balance) {
               break;
           }
           //追加文
           System.out.println("残高が不足しています、残高は " + this.user.get("balance") + " 円です");
       }
       System.out.println(amount + " 円お返ししました");
       //userのbalanceを修正するがString型なのでintで計算してまたStringに戻してから格納する
       //this.balance -= amount;
       //追加文
       this.user.replace("balance", String.valueOf(balance - amount));
   }
   //追加文
   //ユーザー情報セット
   public void setUser(Map<String, String> user) {
       this.user = user;
   }
}