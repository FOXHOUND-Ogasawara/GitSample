/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle {
    public int numDoors;

    public void show() {
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
        System.out.println("ドアの数" + this.numDoors);
    }

    public void start() {
        System.out.println("乗り物が始動しました。");
    }

    public void stop() {
        System.out.println("乗り物が停止しました。");
    }
}
