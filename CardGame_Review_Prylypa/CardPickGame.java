package CardGame_Review_Prylypa;

// 設問2. CardPickGameクラスの追加
class CardPickGame {
	//フィールド
	private int maxBetCoin; //最大ベット枚数
	private int deckSetCount; //カードセット数
	private int possessionCoin; //所持コイン数
	private int oneSetSize; //1セットのサイズ
	private int[][] deck;//　デッキを宣言。2d配列
	// private int playedCardCount; //デッキのカードが無くなったとき、管理するための変数

	//デフォルトコンストラクタ
	public CardPickGame(){
		//フィールド初期化
		this.oneSetSize = 10; //10枚
		this.deckSetCount = 2; //今度のカードスートの数
		this.maxBetCoin = 100;//最大ベット枚数
		this.possessionCoin = 100;//スタートポイント数。ないとゲーム出来ない
		this.deck = new int[this.deckSetCount][this.oneSetSize];
		// this.playedCardCount = 0; // デッキに残ってるカード数を数える
		
		//デッキは2d配列です。数字はカードのポイント数
		for(int i=0; i<this.deckSetCount; i++){
			for(int j=0; j<this.oneSetSize; j++){
				this.deck[i][j] = j+1;//カードの数字を記入する
			}
		}
	}

	//コンストラクタ。数字は入り。
	public CardPickGame (int possessionCoin) {
		this();//最初はデフォルトコンストラクタを起動して、フィードをデフォルトにする
		this.possessionCoin = possessionCoin;//調整する
	}

    // 設問2. ゲーム実行メソッドの追加
	public int execute() {
        //設問5
		//現在の所持コイン枚数を確認する　０以下なら、ゲーム終了。	
		if(this.possessionCoin > 0 ) {
			//ゲーム開始
            //ユーザーに聞き、ゲーム開始、終了と判断する。入力に間違えたらゲームを終了せずに直すチャンスを差し上げます
			System.out.println("You have " + this.possessionCoin + "Coin, Start the game? y / n");
			
            String userInput = "";

			do {
				//ユーザーの記入をしばらく保存する。
				userInput = GameUtils.getInputString();
				//ユーザーの入力を管理する
				//いエースの場合
				if(userInput.equals("y")){
					//次のステップにご案内
					System.out.println("Please bet Coin 1 ~ " + this.possessionCoin + " Max bet is " + this.maxBetCoin );
					int userInputNum;

					//この辺に入力間違い場合は、先と同じ。入力直しチャンス
                    do{
                        //ユーザーの記入をしばらく保存する。
                        userInputNum = GameUtils.getInputInt();
                        
                        //ユーザーの入力管理する
                        //ゼロ以下場合、冗談をやめなさいって
                        if(userInputNum <= 0){
                            System.out.println("you need to make bet 1 or more points!");
                            continue;
                        }
                        //ユーザーの現在の所持コイン枚数による足りないって
                        if(userInputNum > this.possessionCoin){ 
                            System.out.println("you have not enough points to bet");
                            continue;
                        }
                        break;	
                    }while(true);//繰り返し条件。※本気場合はベット確認関数作るべき

					//ユーザーのベット枚数をしばらく保存する
					int betPool = userInputNum;
					//ベットによりユーザーの現在の所持コイン枚数を減らす
					this.possessionCoin -= userInputNum;
					//短期間変数
					int pointsToGet = 0;
					int cardA = this.getCard();
					int cardB = this.getCard();
					int cardSum = cardA + cardB;
					//習得したカードを管理する。合計値を算出する
					System.out.println("Cards drawn are [" + cardA + "] and [" + cardB + "], total is [" + cardSum + "].");


					//勝負結果管理する
					if(this.judgeCard(cardSum)){
						//今度の指示書により、勝の場合、ベットの2倍取得
						pointsToGet = betPool * 2;
						//メッセージで案内
						System.out.println("You Win! Get " + pointsToGet + "Coin!");
					}

					//勝負判断する　（この所少し分かりませんでした。上記と同じらしい。学習会に相談？）
					if(pointsToGet > 0) {
						System.out.println("You got " + pointsToGet + "Coin !!");

						//テスト
						HighAndLowGame hal = new HighAndLowGame(pointsToGet,deckSetCount);
						pointsToGet = hal.execute();

                        this.possessionCoin += pointsToGet;//現在の所持コイン枚数を増やす
					}else{
						System.out.println("You lose");
					}
					
					//ラウンドを終わったらゲームスタート所に戻る
					this.execute();
					
					//ユーザーのノー　場合はゲーム終了
				}else if(userInput.equals("n")){
					return -1;
				//ユーザーの入力は間違えたら、やり直し下さいご案内する
				}else {
					System.out.println("Please enter y or n.");
				}
			}while(!userInput.equals("y") && !userInput.equals("n"));//やり直し条件	
		}
		//ゲームが終了とき結果を出す	
		return this.possessionCoin;
	}
	
    // 設問3. カード合計値取得機能の実装
    private int getCard() {
		//ローカル変数初期化。（次の管理が読みやすいため）　
		// ※簡単なプログラムならまだしも、本気にする場合：ArrayList<Integer> with "size" -> arr.shuffle() -> take and remove from it one by one
        int setCardValue = GameUtils.getRandomInt(this.oneSetSize);//カードの数値
        int setCoverValue = GameUtils.getRandomInt(this.deckSetCount);//カードのスート
        int returnValue;

        //全く同じカードを引いていないかどうかの判定を行う
        if(this.deck[setCoverValue][setCardValue] != 0){
            returnValue = deck[setCoverValue][setCardValue];
            this.deck[setCoverValue][setCardValue] = 0;
        }else{
            return this.getCard();
        }
		
        return returnValue;
    }

	
	//問題4。自明。
    private boolean judgeCard (int getCardResult) {
        return (getCardResult >= 11) ? true : false;
    }
	
}