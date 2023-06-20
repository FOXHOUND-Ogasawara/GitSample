/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには部屋の数を表す int型のnumRoomsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class House extends Building {
  int numRooms;

  public House(String name, int floors, int room) {
    super(name, floors);
    this.numRooms = room;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public void setFloors(int floors) {
    super.setFloors(floors);
  }

  public void show() {
    System.out.println("建物の名称：" + super.name);
    System.out.println(super.floors + "階建ての建物です。");
    System.out.println(room + "部屋あります。");
  }

  public void open() {
    System.out.println("家のドアを開けて入室します。");
  }

  public void close() {
    System.out.println("家のドアを閉めて退出します。");
  }
}