/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle {
    private String model;
    private int year;
    private int numDoors;

    public Car(String model, int year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }

    public show(){
        super.show();
    }

    public start(){
        super.start();
        System.out.println("エンジンが始動しました");
    }

    public stop(){
        super.stop("エンジンが停止しました");
    }
    
}
