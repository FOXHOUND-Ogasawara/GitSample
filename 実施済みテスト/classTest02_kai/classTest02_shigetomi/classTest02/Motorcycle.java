/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehicle {
    public boolean hasSideCar;

    public static void Motorcycle {
    System.out.println(hasSideCar);
    }
    
    public void show() {
        System.out.println("モデル:" + this.model);
        System.out.println("サイドカーの有無:" + this.hasSideCar);
    }

    public void start() {
        System.out.println("キックスタートしてエンジンを始動します。");
    }

    public void stop() {
        System.out.println("エンジンを停止して停車します。");
    }

}


