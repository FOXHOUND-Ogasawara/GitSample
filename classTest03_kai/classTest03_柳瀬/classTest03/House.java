/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building{
    int numRooms;

    public int numRooms(){
        return this.numRooms;
    }

    public void setnumRooms(int numRooms){
        this.numRooms = numRooms;
    }
}