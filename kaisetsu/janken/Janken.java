package janken;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
// import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Janken {
   private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
   private Map<Integer, String> hands = new HashMap<Integer, String>();
   private List<String> results = new ArrayList<String>();

   private int playerHand; // プレイヤーの入力値用
   private int cpuHand;
   private int selectMode;

   private int playerPoint = 0;
   private int cpuPoint = 0;
   private int evenPoint = 0;

   public Janken() {
       hands.put(1, "グー");
       hands.put(2, "チョキ");
       hands.put(3, "パー");
       results.add("あいこ");
       results.add("負け");
       results.add("勝ち");
   }

   public void execution() {
       this.inputPlayerHand();
   }

   private void showMenu(Map<Integer, String> menu) {
       menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
       System.out.print("\n");
   }

   private void inputPlayerHand() {
       while (true) {
           this.showMenu(this.hands);
           this.playerHand = this.inputNum();

           if (this.playerHand > 0 && this.playerHand <= this.hands.size()) {
               setCpuHand();
               this.showJankenResult(this.playerHand, this.cpuHand);
               break;
           }
           System.out.println("該当する半角数値で入力してください");
       }

       System.out.println("ゲームを続けますか？ 1:続ける 2:やめる");
       this.selectMode = this.inputNum();
       while(true) {
           if (this.selectMode == 1) {
               inputPlayerHand();
           }
           else if (this.selectMode == 2) {
               break;
           }
           else {
               // 値不正
           }
       }
       System.out.println("Player : " + playerPoint + "回勝ち");
       System.out.println("CPU   : " + cpuPoint + "回勝ち");
       System.out.println("引き分け : " + evenPoint + "回");
   }

   private int inputNum() {
       try {
           return Integer.parseInt(BR.readLine());
       } catch (NumberFormatException | IOException e) {
           return 0;
       }
   }

   private void setCpuHand() {
       this.cpuHand = new Random().nextInt(this.hands.size()) + 1;
   }

   private void showJankenResult(int playerHandNum, int cpuHand) {
       String playerHandStr = hands.get(playerHandNum);
       String cpuHandStr = hands.get(cpuHand);

       System.out.println("じゃんけんの結果");
       System.out.println("Player : " + playerHandStr);
       System.out.println("CPU    : " + cpuHandStr);
       System.out.print("Result : ");
       if (playerHandStr == cpuHandStr) {
           System.out.println("あいこ");
           evenPoint++;
           return;
       }
       else if (playerHandStr == "グー") {
           if (cpuHandStr == "チョキ") {
               playerWin();
           }
           if (cpuHandStr == "パー") {
               playerLose();
           }
       }
       else if (playerHandStr == "チョキ") {
           if (cpuHandStr == "パー") {
               playerWin();
           }
           if (cpuHandStr == "グー") {
               playerLose();
           }
       }
       else if (playerHandStr == "パー") {
           if (cpuHandStr == "グー") {
               playerWin();
           }
           if (cpuHandStr == "チョキ") {
               playerLose();
           }
       }
   }

   private void playerWin() {
       System.out.println("勝ち");
       playerPoint++;
   }

   private void playerLose() {
       System.out.println("負け");
       cpuPoint++;
   }
}