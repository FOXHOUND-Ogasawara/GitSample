/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building {
    private String name;
    private int floors;
    private int numRooms;

    public void House(String name, int floors, int numRooms)
    {
        super(name, floors);
        this.numRooms = numRooms;
    }

    public void setNumFloors(int numRooms)
    {
        this.numRooms = numRooms;
    }

    public void getNumFloors()
    {
        return this.numRooms;
    }

    @Override
    public void show()
    {
        super.show();
    }

    public void open()
    {
        System.out.println("家のドアを開けて入室します。");
    }

    public void close()
    {
        System.out.println("家のドアを閉めて退出します。");
    }
}