/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building {
    private int numRooms;

    public House(int numRooms) {
        this.numRooms = numRooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getName() {
        return this.name;
    }

    public int getRoom() {
        return this.numRooms;
    }

    public void show(){
        System.out.println(this.floors + "階建ての建物です。");
        System.out.println(this.numRooms + "部屋あります。");

    }

    public void open() {
        System.out.println("家のドアを開けて入室します。");
    }

    public void close() {
        System.out.println("家のドアを閉めて退出します。");
    }
}