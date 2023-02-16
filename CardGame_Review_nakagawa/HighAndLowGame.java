package CardGame_Review_nakagawa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HighAndLowGame {
  private int earnedCoinCount;
  private int maxWinCoin = 1000;
  private int deckSetCount;

  public HighAndLowGame(int earnedCoinCount, int deckSetCount) {
    this.earnedCoinCount = deckSetCount;
  }

  public int execute() {
    List<Integer> cardList = new ArrayList<Integer>();
    cardList = this.getCard(cardList);

    while (true) {
      if (this.earnedCoinCount > this.maxWinCoin) {
        return this.earnedCoinCount;

      }
      System.out.println("your winCoin is" + this.earnedCoinCount);

      while (true) {
        System.out.println("playing High And Low ? y /n");
        String startValue = GameUtils.getInputString();
        if (startValue.equals("n")) {
          return this.earnedCoinCount;
        } else if (startValue.equals("y")) {
          break;

        } else {
          System.out.println("Input error...Please retype!");
        }
      }

      cardList = this.getCard(cardList);

      boolean isWinner = this.judgeCard(cardList, false);

      if (isWinner) {
        this.earnedCoinCount *= 2;
      } else {
        this.earnedCoinCount = 0;
      }

      if (this.earnedCoinCount == 0) {
        return this.earnedCoinCount;
      }
      System.out.println("you got" + this.earnedCoinCount + "Coin !!");
    }
  }

  private List<Integer> getCard(List<Integer> cardList) {
    List<List<Integer>> setDeck = new ArrayList<List<Integer>>();
    List<Integer> onePair = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    for (int i = 0; i < this.deckSetCount; i++) {
      setDeck.add(i, onePair);
    }
    int cardA;

    while (true) {

      int randomNumA1 = GameUtils.getRandomInt(2);
      int randomNumA2 = GameUtils.getRandomInt(10);
      System.out.println("randomNumA1:" + randomNumA1);
      System.out.println("randomNumA1:" + randomNumA2);
      cardA = setDeck.get(randomNumA1).get(randomNumA2);

      int count = 0;
      for (int value : cardList) {
        if (cardA == value) {
          count++;
        }
      }
      if (count < this.deckSetCount) {
        break;
      }
    }
    cardList.add(cardA);
    int lastIdx = cardList.size() - 1;
    int showValue = cardList.get(lastIdx);

    System.out.println("pick card --" + showValue + "--");
    return cardList;
  }

  private boolean judgeCard(List<Integer> cardList, boolean pickChoice) {
    int num = cardList.size();
    int lastcard = cardList.get(num - 1);
    int penultimateCard = cardList.get(num - 2);

    if (lastcard == penultimateCard) {
      return false;
    }
    boolean flg = (lastcard > penultimateCard) ? true : false;
    if (pickChoice == flg) {
      return true;
    }
    return false;
  }

}
