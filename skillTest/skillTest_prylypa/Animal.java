package skillTest.skillTest_prylypa;
class Animal {
    //フィールド宣言
    private String name;//動物の名前
    private int age;//動物の年齢

    //デフォルト・コンストラクタ
    public Animal () {
        this.name = "default";
        this.age = 0;
    }

    //パラメーター持ちコンストラクタ
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //フィールドを以下のように表示する
    public void showProperties() {
        System.out.println("名前: " + this.getName());
        System.out.println("年齢: " + this.getAge());
    }
    
    //追加メゾット　セット・ゲット＝＝＝＝＝＝
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    //＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝

    
    
}