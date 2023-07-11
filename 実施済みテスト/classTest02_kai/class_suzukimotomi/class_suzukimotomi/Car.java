/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle{
    private int numDoors;

    public Car(String model, int year, int型numDoors) {
        super(model, year); 
        this.numDoors = numDoors;
    }

   

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

}
