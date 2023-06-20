/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vihicle{
    public int numDoor;

    public void numDoor {
    this.numDoor = numDoor;
    }

    public void show() {
        System.out.println("製造年:" + this.year);
        System.out.println("ドアの数:" + this.numDoor);
    }

    public void start() {
        System.out.println("エンジンをかけて走行します。");
    }

    public void stop() {
        System.out.println("エンジンを停止して停車します。");
    }
}
