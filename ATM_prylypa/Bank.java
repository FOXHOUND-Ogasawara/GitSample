package ATM_prylypa;

import java.util.Map;
import java.util.HashMap;

class Bank{
	//フィールド
	private String name;//銀行名
	private Map<String,String> client = new HashMap<String, String>(); //お客様リスト・データ
	private Map<Integer,String> menu = new HashMap<Integer, String>(); //銀行メニュー
	private CommonIO myUtils = new CommonIO();//一般的な機能持ちクラス
	private ATM myAtm;//ATM用
	private boolean inUse;

	//デフォールトコンストラクタ。フィールド初期化
	public Bank(){
		this.name = "UJF";
        this.myAtm = new ATM();
		this.client.put("name", "Taro");
		this.client.put("balance","10000");
		this.menu.put(1,"ATM 利用");
		this.menu.put(2,"終了");
		this.inUse = false;
	}
	//起動メゾット
	public void serviceStart(){
        int clientBalance = 0;//一時的な変数。客さんのお金額保存用
        if(!this.inUse){//挨拶メッセージを最初だけ見せる
            System.out.println("いらっしゃいませ、ようこそ SLS銀行へ\n" + this.client.get("name") + "様ようこそ");
            this.inUse = true;
        }
		
		this.myUtils.showMenu(this.menu);//メニューを見せる
		int userInput = this.myUtils.getUserInput(menu.size());//ユーザー記入取得と管理↓↓↓
		switch(userInput){
			case 1:
				this.myAtm.execution(Integer.parseInt(this.client.get("balance")));	
                this.client.put("balance", Integer.toString(this.myAtm.getBalance()));
				break;
			case 2:
				System.out.println("ご利用ありがとうございました、またのご利用お待ちしております");
				break;
		}
		//まだつずけたいなら始めに戻る
        if(userInput != 2){
            this.serviceStart();
        }
	}

}