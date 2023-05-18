import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

class Janken {
   //定数として扱う
   private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
   //じゃんけんの手
   private Map<Integer, String> hands = new HashMap<Integer, String>();
   //勝敗の結果表示
   private List<String> results = new ArrayList<String>();

   private int playerHand;
   private int cpuHand;
   private int result;
   private int select;
   private int drawcount = 0;
   private int losecount = 0;
   private int wincount = 0;

   //コンストラクタ(各フィールドに初期値を設定する)
   public Janken() {
       //フィールドのhandsに下記の値を格納する。
       hands.put(1, "グー");
       hands.put(2, "チョキ");
       hands.put(3, "パー");
       //フィールドのresultsに下記の値を格納する。
       results.add("あいこ");
       results.add("負け");
       results.add("勝ち");
   }

   //実行処理
   public void execution() {
       this.inputPlayerHand();
       this.setCpuHand();
       this.judgement();
       this.showResult();
       this.showaRematch();
       this.inputPlayerSelect();
   }

   //選択処理を表示する
   private void showMenu(Map<Integer, String> menu) {
       menu.forEach((key, value) -> {
           System.out.print(key + ":" + value + " ");
       });
       System.out.println();
   }

   //プレイヤーの手を入力する
   private void inputPlayerHand() {
       while (true) {
           this.showMenu(this.hands);
           //プレイヤーの手をセット
           this.playerHand = this.inputNum();

           //１～３の範囲内であれば繰り返し処理を終了する
           if (this.playerHand > 0 && this.playerHand <= this.hands.size()) {
               break;
           }
           System.out.println("該当する半角数字で入力してください");
       }
   }

   //CPUの手を入力する
   private void setCpuHand() {
           Random random = new Random();
           this.cpuHand = random.nextInt(4) + 1;
           System.out.println(this.cpuHand);
   }

   //数字入力と数値であるかの判断
   private int inputNum() {
       try {
           return Integer.parseInt(BR.readLine());
       } catch (IOException | NumberFormatException e) {
           // NumberFormatExceptionが発生した場合 → 数値以外が入力されたと判断する
           // 強制的に 0 を返却
           return 0;
       }
   }

   //勝敗を判定する
   private void judgement() {
       //あいこであれば以降の確認不要
       if (this.playerHand == this.cpuHand) {
           this.result = 0;
           this.drawcount++;
           return;
       }

       //それぞれの場合で確認する
       switch (this.playerHand) {
           case 1: //グーの場合
               if (this.cpuHand == 2) {
                   this.result = 2; //勝ち
                   this.wincount++;
               } else if (this.cpuHand == 3) {
                   this.result = 1; //負け
                   this.losecount++;
               }
               break;
           case 2: //チョキの場合
               if (this.cpuHand == 1) {
                   this.result = 1; //負け
                   this.losecount++;
               } else if (this.cpuHand == 3) {
                   this.result = 2; //勝ち
                   this.wincount++;
               }
               break;
           case 3: //パーの場合
               if (this.cpuHand == 1) {
                   this.result = 2; //勝ち
                   this.wincount++;
               } else if (this.cpuHand == 2) {
                   this.result = 1; //負け
                   this.losecount++;
               }
               break;
       }
   }

   //結果を表示する
   private void showResult() {
       System.out.println("Player : " + hands.get(playerHand));
       System.out.println("CPU    : " + hands.get(cpuHand));
       System.out.println("Result : " + results.get(this.result));
   }

   private void showaRematch() {
       System.out.println("1:もう一度対戦する 2:終了する");
   }

   private void inputPlayerSelect() {
       while (true) {

           this.select = this.inputNum();

           if (this.select == 1) {
               this.execution();
               break;
           } else if (this.select == 2) {
               System.out.println("最終結果 : " + this.wincount + "勝 " + this.losecount + "敗 " + this.drawcount + "引き分け");
               break;
           }
           System.out.println("該当する半角数字で入力してください");
       }
   }
}