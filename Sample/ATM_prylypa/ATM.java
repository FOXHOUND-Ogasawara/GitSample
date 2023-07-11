package ATM_prylypa;

import java.util.Map;
import java.util.HashMap;

class ATM{
	//フィールド
	private Map<Integer,String> menu = new HashMap<Integer, String>(); //ATMメニュー
	private CommonIO myUtils = new CommonIO(); //一般的な機能持ちクラス
	private int balance;
	private int maxDepositValue;
	private int maxWithdrawalValue;
	
	//デフォールトコンストラクタ。フィールド初期化
	public ATM(){
		//フィールドに初期値を設定する
		this.menu.put(1,"預け入れ");
		this.menu.put(2,"引き出し");
		this.menu.put(3,"残高照会");
		this.menu.put(4,"終了");

		this.balance = 0;
		this.maxDepositValue = 2000000;
		this.maxWithdrawalValue = 50000;

	}
	//管理行う前に銀行から取得もの
	public void setBalance(int amount){
		this.balance = amount;
	}
	//管理完了後で銀行に渡すもの
	public int getBalance (){
		return this.balance;
	}
	//以降の課題で実装する各機能を実行する
	public void execution(int balance){
		this.setBalance(balance);//金額取得
		this.myUtils.showMenu(this.menu);//メニュー見せる
		int userInput = this.myUtils.getUserInput(menu.size());////ユーザー記入取得と管理↓↓↓
		switch(userInput){
			case 1:
				this.deposit();	
				break;
			case 2:
				this.withdrawal();
				break;
			case 3:
				this.showBalance();
				break;
			case 4:
				System.out.println("ATM のご利用ありがとうございました");
				break;
		}
		//まだつずけたいなら始めに戻る
		if(userInput != 4){
			this.execution(this.balance);
		}
	}
	//お客様に金額を出力する
	private void showBalance(){
		System.out.println("残高は" + this.balance + "円です");
	}
	//お客様がお金を入れたいなら
	private void deposit(){
		System.out.println("ご入金額を入力してください:");
		int input = this.myUtils.getUserInput(this.maxDepositValue);
		this.balance += input;
		System.out.println(this.balance + "円お預かりしました");
	}
	//お客様がお金を出したいなら
	private void withdrawal(){
		System.out.println("ご出金額を入力してください");
		if(this.balance == 0){
			System.out.println("残高がありません");
			return;
		}
		int userInput = this.myUtils.getUserInput(maxWithdrawalValue);
		if(this.balance < userInput){
			System.out.println("残高が不足しています、残高は {"+ this.balance + "} 円です");
			return;
		}
		System.out.println(userInput + " 円お返ししました");
		this.balance -= userInput;
	}
}