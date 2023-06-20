/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building {
    private int numOffices;

    public OfficeBuilding(int numOffices) {
        this.numOffices = numOffices;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(int numOffices) {
        this.numOffices = numOffices;
    }

    public String getName() {
        return this.name;
    }
    public int getOffice() {
        return this.numOffices;
    }

    public void show(){
        System.out.println("建物の名称：" + this.name);
        System.out.println(this.numOffices + "のテナントが入っています。");
    }

    public void open() {
        System.out.println("オフィスビルのエントランスを開けて入室します。");
    }

    public void close() {
        System.out.println("オフィスビルのエントランスを閉めて退出します。");
    }
}