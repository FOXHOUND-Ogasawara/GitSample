/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building{
    public int numRooms;

    public House(String name, int floors, int numRooms){
        super(name, floors);
        this.numRooms = numRooms;
    }
    @override
    public void show(){
        super.show();
        System.out.println(this.numRooms + "部屋あります。");
    }
    @override
    public void open(){
        System.out.println("家のドアを開けて入室します。");
    }
    @override
    public void close(){
        System.out.println("家のドアを閉めて退出します。");
    }
}