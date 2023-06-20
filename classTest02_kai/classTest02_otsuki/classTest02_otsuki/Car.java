/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle { 
    int numDoors;

    public Car(String model, int year,numDoors){
        super(model,year);
        this.numDoors = numDoors;
    }

    public void show(){
        super.show();
        System.out.println("ドアの数は"+this.numDoors);
    }
}
