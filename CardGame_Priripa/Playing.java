import java.io.IOException;

class Playing {
	
	public static void main(String[] args) {
		//先のクラスにはthrows　をよく使ったため、trycatch 必要
        int possessionCoin = 100;//スタートポイント
        String userName = "";//ユーザー名
        String msg = "";//ゲーム終了のメッセージ
        System.out.println("Welcome");//最初の挨拶
        System.out.println("Please enter your name:");//ユーザー名を聞く

        do{
            userName = GameUtils.getInputString();//入力習得
            //入力管理する。パターンに合わない場合、直してくださいって
            if(GameUtils.checkPattern(userName)){
                userName = userName;
            }else{
                System.out.println("Does not match condition of the username");
            }
        }while(!GameUtils.checkPattern(userName));//繰り返し案件
        System.out.println("Hello " + userName);//個人的な挨拶
        CardPickGame cpg = new CardPickGame(possessionCoin);//ゲームのクラス初期化
        possessionCoin = cpg.execute(); //ゲームを起動
        
        if(possessionCoin == 0) {
            msg = "You run out of coins: ";
        }else if(possessionCoin > 0){
            msg = "Your result: " + possessionCoin + "coins";
        }else{
            return; //ゼロ以下の数字はエラー管理ため。
        }
        System.out.println(msg);
        
    }
}