package Sample.JankenGame_prulypa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Janken{
    //フィールド宣言・初期化
	private Map<Integer,String> hands = new HashMap<Integer, String>(); //じゃんけんの手
	private List<String> results = new ArrayList<String>(); //勝敗の結果表示
	private String playerHand = "";
	private String cpuHand = "";

    //デフォルトコンストラクタ
	public Janken(){
		//各フィールドに初期値を設定する

		hands.put(1,"グー");
		hands.put(2,"チョキ");
		hands.put(3,"パー");

		results.add("あいこ");
		results.add("負け");
		results.add("勝ち");

	}
	//以降の課題で実装する各機能を実行する
	public void execution(){
        //スタートメニューを見せる
        this.showMenu(this.hands);
        //ユーザー入力
		int userHandIndex = this.getUserInput(3);
		this.playerHand = this.hands.get(userHandIndex);//ユーザー入力を管理・保存
		//同じく。AI管理
		int cpuHandindex = this.getCpuInput();
		this.cpuHand = this.hands.get(cpuHandindex);
		//ゲームを判断する
		String result = getResult(userHandIndex,cpuHandindex);
		//もう一回？
		System.out.println("player: " + playerHand + "\nCPU: " + cpuHand + "\nResult: " + result);
		System.out.println("1:もう一度対戦する 2:終了する");
		int oneMoreTime = this.getUserInput(2);
		if(oneMoreTime == 1){
			this.execution();
		}else{
			return;
		}

	}

	// 選択肢を表示する
	private void showMenu(Map<Integer, String> menu) {
        menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
        System.out.println();
    }
	//ユーザー入力取得管理
	private int getUserInput(int max){
		int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            num = Integer.parseInt(br.readLine());
			if(num > max || num < 1){//NG入力場合、やり直し管理
				System.out.println("1-" + max + "!");
				num = getUserInput(max);
			}
        }catch (NumberFormatException e){
            System.out.println("Please enter an integer! either of 1-" + max + "!");
            num = getUserInput(max);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

		return num;
	}
	//AI管理
	private int getCpuInput() {
		Random rnd = new Random();
		return rnd.nextInt(3)+1;
    }
	//判断管理
	private String getResult(int playerHand, int cpuHand){
		if(playerHand - cpuHand == 0){
			return this.results.get(0);//tie
		}else if(playerHand - cpuHand == -1 || playerHand - cpuHand == 2){
			return this.results.get(2);//win
		}else{
			return this.results.get(1);//loose
		}
	}

}