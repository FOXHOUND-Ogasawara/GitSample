/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehicle {
    
    boolean hasSaidCar;

    public Motorcycle(String model,int year,boolean hasSaidCar){
        super(model,year);
        System.out.println("サイドカーの有無:"+hasSaidCar);
    }

    public void start(){
        System.out.println("キックスタートで始動します｡");
    }
    
    public void stop(){
        System.out.println("エンジンが停止し､停車します｡");
    }

}