/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle{
    public int numDoors;

    public Car(String model, int year, int numDoors){

    }

    @override
    public void show(){
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
        System.out.println("ドアの数:" + this.numDoors);
    }
}
