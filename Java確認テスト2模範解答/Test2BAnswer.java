package Java確認テスト2模範解答;

class Character {

  public void showName() {
    System.out.println("一般的なキャラクターです。");
  }
}

// Q7.Characterクラスを継承したサブクラスを二つ作成してください。
// Q8.作成したサブクラスにオーバーライドを用いて、それぞれ「ノアです。」、「キーキャップねこです。」と出力するメソッドを定義してください。

//Q7,Q8 解答
class HumanCharacter extends Character {

  @Override
  public void showName() {
    System.out.println("ノアです。");
  }
}

class AnimalCharacter extends Character {

  @Override
  public void showName() {
    System.out.println("キーキャップねこです。");
  }
}

// Q9.Partyクラスを作成し、Character型の配列を定義。Characterクラスと作成したサブクラスのインスタンスを配列に格納してください。

// Q9解答
class Party {

  public Character[] characters = new Character[3];

  public Party() {
    characters[0] = new Character();
    characters[1] = new HumanCharacter();
    characters[2] = new AnimalCharacter();
  }
}

class Test2BAnswer {

  public static void main(String[] args) {
    // Q10.Partyクラスのインスタンスを⽣成し、キャラクターの種類を全て出⼒しなさい。
    // 出力結果:
    // 一般的なキャラクターです。
    // ノアです。
    // キーキャップねこです。

    // Q10解答
    // 解答
    Party party = new Party();

    // 拡張 for 文の場合 ※for文でもOK
    for (Character character : party.characters) {
      character.showName();
    }
    // for 文の場合
    for (int i = 0; i < party.characters.length; i++) {
      party.characters[i].showName();
    }
  }
}
