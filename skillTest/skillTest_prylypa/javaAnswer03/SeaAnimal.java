class SeaAnimal extends Animal {
    //フィールド宣言
    private int swimSpeed;

    //デフォルト・コンストラクタ
    public SeaAnimal(){
        this.swimSpeed = 0;
    }

    //パラメーター持ちコンストラクタ
    public SeaAnimal(String name, int age, int swimSpeed){
        super(name,age);//name とage は親のコンストラクタに渡す
        this.swimSpeed = swimSpeed;
    }

    //フィールドを以下のように表示する
    public void showProperties() {
        super.showProperties();//name とage は親のshowProperties() メソッドから出力してもらう
        System.out.println("泳ぐ速度: " + this.getSweemSpeed() + "km/h");
    }

    //追加メゾット　セット・ゲット＝＝＝＝＝＝
    public void setSweemSpeed(int swimSpeed){
        this.swimSpeed = swimSpeed;
    }

    public int getSweemSpeed(){
        return this.swimSpeed;
    }
    //＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
}