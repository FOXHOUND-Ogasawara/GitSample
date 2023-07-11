/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle {

    int numDoors;

    public Car(String model,int year,int numDoors){
        super(model,year);
        System.out.println("ドアの数:"+numDoors);
    }
    
    public void start(){
        System.out.println("エンジンで始動します｡");
    }
    
    public void stop(){
        System.out.println("エンジンが停止し､停車します｡");
    }
}
