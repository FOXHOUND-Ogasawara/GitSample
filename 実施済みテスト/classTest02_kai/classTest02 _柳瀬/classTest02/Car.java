/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle{
    int numDoors;

    public int getnumDoors(){
        return this.numDoors;
    }

    public void setnumDoors(int numDoors){
        this.numDoors = numDoors;
    }
}
