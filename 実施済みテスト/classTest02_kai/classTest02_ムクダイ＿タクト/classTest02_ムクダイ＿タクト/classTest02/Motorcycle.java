/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    private String model;
    private int year;

    public Motorcycle(String model, int year, boolean hasSideCar){
        super(model, year);
        this.hasSideCar = hasSideCar;
    }

    public show(){
        super.show();
        System.out.println("サイドカーの有無" + this.hasSideCar);
        
    }

    public start(){
        //super.start();
        System.out.println("エンジンが始動しました");
    }
    public stop(){
        super.stop();
        System.out.println("エンジンが停止しました");
    }
}