package kaisetsu;
public class Sample1 {
  public static void main(String[] args) {
    //1. 変数の宣言　boolean型は宣言時に初期化が必須
    boolean boolValue = true;
    //2. isEvenメソッドの返り値を受け取る
    boolValue = isEven(5,3);
    //6. 結果を出力する
    System.out.println(boolValue);
  }
  //3. isEvenメソッドの実装
  public static boolean isEven(int minuend, int subtrahend){
    //4. 引数1 - 引数2の剰余残の結果により偶奇判別
    boolean boolValue = (minuend - subtrahend) % 2 == 0;
    //5. 結果を返す
    return boolValue;

  }
}