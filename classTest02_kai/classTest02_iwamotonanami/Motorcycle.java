/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehicle {
    public boolean hasSideCar();
    
    
    public void show() {
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
    }

    public void start() {
        System.out.println("乗り物が始動しました。");
    }

    public void stop() {
        System.out.println("乗り物が停止しました。");

    }
}