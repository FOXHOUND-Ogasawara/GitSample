/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building{
    private String name;
    private int floors;
    private int numRooms;

    public House(String name, int floors, int numRooms){
        super(name, floors);
        this.numRooms = numRooms;
    }

    @Override
    public show(){
        super.show();
        System.out.println(this.numRooms + "部屋あります。");
    }

    @Override
    public open(){
        System.out.println("家のドアを開けて入室します。");
    }
    
    @Override
    public close(){
        System.out.println("家のドアを閉めて退出します。");
    }
}