/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building {
    public int numOffice;

    @Override
    public void show(){
        System.out.println("建物の名称：" + this.name);
        System.out.println(this.floors + "階建ての建物です。");
        System.out.println(this.numOffice + "個のテナントが入っています。");
    }

    @Override
    public void open() {
        System.out.println("オフィスビスのエントランスを開けて入室します。");
    }

    @Override
    public void close() {
        System.out.println("オフィスビルのエントランスを閉めて退出します");
    }
    
}