package CardGame_Review_Prylypa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HighAndLowGame {
    private int earnedCoinCount; // 習得コイン数
    private int maxWinCoin; // 最大獲得コイン数
    private int deckSetCount; // カードセット数

    // 最初はデフォルトコンストラクタで初期化
    public HighAndLowGame() {
        this.earnedCoinCount = 0;
        this.maxWinCoin = 100000;
        this.deckSetCount = 0;
    }

    // パラメータ入りコンストラクタ
    public HighAndLowGame(int earnedCoinCount, int deckSetCount) {
        this();// 最初はデフォルトコンストラクタに委任
        this.earnedCoinCount = earnedCoinCount;// フィールド調整
        this.deckSetCount = deckSetCount;// フィールド調整

    }
    // まだ空

    public int execute() {
        // #1
        List<Integer> cardList = new ArrayList<Integer>();
        // start do while here ?
        cardList = getCard(cardList);

        // #2
        if (this.earnedCoinCount > this.maxWinCoin) {
            return this.maxWinCoin;
        } else {
            System.out.println("Your win points is " + this.earnedCoinCount);
        }
        // #3
        String userInputStrHALyOn = "";

        // ユーザー入力チェック管理
        do {
            System.out.println("Playing High And Low ? y / n");
            userInputStrHALyOn = GameUtils.getInputString();
            // ゲーム開始「4. ハイかローを選択する」の処理に続く
            if (userInputStrHALyOn.equals("y")) {
                boolean flg = false;
                // #4 ハイかローを選択する
                System.out.println("High or Low ? h / l");
                String userInputStrHALhOl = "";
                // ユーザー入力チェック：[h] or [l]
                do {
                    userInputStrHALhOl = GameUtils.getInputString();
                    // h == true
                    if (userInputStrHALhOl.equals("h")) {
                        flg = true;
                    } else if (userInputStrHALhOl.equals("l")) {
                        flg = false; // GameUtils.getIputString().equals("l") != true-> repeat input
                    } else {
                        // 再記入依頼メッセージ発生
                        System.out.println("Input error... Please input [h] or [l]");
                    }
                } while (!userInputStrHALhOl.equals("h") && !userInputStrHALhOl.equals("l"));

                // も一枚カード取得する
                cardList = getCard(cardList);
                for (int card : cardList) {
                    System.out.println(card);
                }
                // 最後の2枚カードを比べる結果取得
                boolean result = judgeCard(cardList, flg);

                // 上記を管理する。二倍化・ゼロ化
                if (result) {
                    this.earnedCoinCount *= 2;
                } else {
                    this.earnedCoinCount = 0;
                }

                // ゲームオーバー。終了条件１。ゼロではない場合、ステイタス発表
                if (this.earnedCoinCount == 0) {
                    System.out.println("You loose. all coins are lost!");
                    return 0;
                    // 最大達成。終了条件２
                } else if (this.earnedCoinCount > this.maxWinCoin) {
                    System.out.println("maximum coins reached!\nCasino bancrupt T.T");
                    break;
                } else {
                    System.out.println("You got" + (this.earnedCoinCount / 2) + "Coins !!");
                    System.out.println("Your winning is " + this.earnedCoinCount + "Coins");
                    userInputStrHALyOn = "";
                    continue;
                }

                // 処理終了で現在の所持コイン数を返却
            } else if (userInputStrHALyOn.equals("n")) {
                break;
            } else {
                // 再記入依頼メッセージ発生
                System.out.println("Input error... Please input [y] or [n]!");
            }

        } while (!userInputStrHALyOn.equals("y") && !userInputStrHALyOn.equals("n"));

        return this.earnedCoinCount;

    }

    private List<Integer> getCard(List<Integer> cardList) {

        List<List<Integer>> setDeck = new ArrayList<List<Integer>>();// 短期間デッキを宣言 1-4 でしょうかな
        List<Integer> suits = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));// デッキにはスーツもついか 1-10

        // 短期間デッキを初期化
        for (int i = 0; i < this.deckSetCount; i++) {
            setDeck.add(i, suits);
        }

        System.out.println(cardList);

        // 乱数のカードを1枚取得する
        int tmpSuit = GameUtils.getRandomInt(deckSetCount);
        int tmpNumber = GameUtils.getRandomInt(suits.size());

        // このカードを「手」に追加する
        cardList.add(setDeck.get(tmpSuit).get(tmpNumber));

        System.out.println("pick card --" + cardList.get(cardList.size() - 1) + "--");

        return cardList;
    }

    private boolean judgeCard(List<Integer> cardList, boolean pickChoice) {

        // 短期間変数準備
        int cardA = cardList.size() - 1;// 最後のカード
        int cardB = cardList.size() - 2;// 最後の1枚前のカード
        boolean returnValue;// 戻り値
        System.out.println("cardA:" + cardList.get(cardA));
        System.out.println("cardB:" + cardList.get(cardB));
        // 結果を判定する
        if (cardList.get(cardA) == cardList.get(cardB)) {
            returnValue = false;
        }

        if (pickChoice) {
            if (cardList.get(cardA) > cardList.get(cardB)) {
                returnValue = true;
            } else {
                returnValue = false;
            }
        } else {
            if (cardList.get(cardA) < cardList.get(cardB)) {
                returnValue = true;
            } else {
                returnValue = false;
            }
        }

        // 結果を戻る
        return returnValue;
    }
}
