/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building {
    private int numRooms;

    public House(int floors, String name) {
        super(); 
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public show(){
        this(2);
    }

    public open(){
        this(4);
    }

    

}