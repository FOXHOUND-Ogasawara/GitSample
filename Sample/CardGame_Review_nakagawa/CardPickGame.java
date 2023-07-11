package CardGame_Review_nakagawa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CardPickGame {
  private int maxBetCoin = 100;
  private int deckSetCount = 2;
  private int possessionCoin;

  public CardPickGame(int possessionCoin) {
    this.possessionCoin = possessionCoin;
  }

  public int execute() {
    while (true) {

      if (this.possessionCoin == 0) {
        return this.possessionCoin;
      }
      while (true) {
        System.out.println("you have" + this.possessionCoin + "Coin,Start the game? y / n");
        String startValue = GameUtils.getInputString();

        if (startValue.equals("y")) {
          break;
        } else if (startValue.equals("n")) {
          return this.possessionCoin;
        } else {

          System.out.println("Please enter y or n.");
        }
      }
      int ableBetCoin = Math.min(this.maxBetCoin, this.possessionCoin);
      System.out.println("Please bet Coin 1 ~" + ableBetCoin);

      int userBetCoin = 0;
      while (true) {
        userBetCoin = GameUtils.getInputInt();
        if (userBetCoin > 0 && userBetCoin <= ableBetCoin) {
          break;
        }
      }
      this.possessionCoin -= userBetCoin;

      int userCard = this.getCard();

      boolean isWinner = this.judgeCard(userCard);
      int getCoin = 0;

      if (isWinner) {
        getCoin = userBetCoin * 2;

        System.out.println("you win! Get" + getCoin + "Coin!");

        HighAndLowGame highAndLowGame = new HighAndLowGame(getCoin, this.deckSetCount);

        getCoin = highAndLowGame.execute();

        this.possessionCoin += getCoin;
      }
      if (getCoin == 0) {

        System.out.println("you lose");
      }
      if (getCoin >= 1) {

        System.out.println("you got" + getCoin + "Coin !!");
      }
    }
  }

  private int getCard() {
    List<List<Integer>> setDeck = new ArrayList<List<Integer>>();
    List<Integer> onePair = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    for (int i = 0; i < this.deckSetCount; i++) {
      setDeck.add(i, onePair);
    }
    int randomNumA1;
    int randomNumA2;
    int randomNumB1;
    int randomNumB2;
    while (true) {
      randomNumA1 = GameUtils.getRandomInt(2);
      randomNumA2 = GameUtils.getRandomInt(10);
      randomNumB1 = GameUtils.getRandomInt(2);
      randomNumB2 = GameUtils.getRandomInt(10);

      if ((randomNumA1 == randomNumB1 && randomNumA2 == randomNumB2)) {
        break;
      }
    }
    int cardA = setDeck.get(randomNumA1).get(randomNumA2);
    int cardB = setDeck.get(randomNumB1).get(randomNumB2);

    int userNumSum = cardA + cardB;

    System.out.println("Cards drawn are " + cardA + "and" + cardB + ",total is" + userNumSum + ".");

    return userNumSum;
  }

  private boolean judgeCard(int getCardResult) {
    return (getCardResult >= 11) ? true : false;
  }
}
