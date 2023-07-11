/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building {
  int numOffices;

  public OfficeBuilding(String name, int floors, int tenant) {
      super(name, floors);
      this.numOffices = tenant;
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
    System.out.println(room + "個のテナントが入っています。");
  }

  public void open() {
    System.out.println("オフィスビルのエントランスを開けて入室します。");
  }

  public void close() {
    System.out.println("オフィスビルのエントランスを閉めて退出します。");
  }
}