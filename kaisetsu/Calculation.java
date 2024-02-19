package kaisetsu;
class Calculation {
    int num1;
    int num2;

    public Calculation() {
        // 10 という定数を使用し引数が 1 つのコンストラクタを内部で呼び出す
        this(10);
    }

    public Calculation(int num1) {
        // num1 と 5という定数を使用し引数が 2 つのコンストラクタを内部で呼び出す
        this(num1, 5);
    }

    public Calculation(int num1, int num2) {
        // 引数をインスタンス変数に代入する
        this.num1 = num1;
        this.num2 = num2;
    }
}