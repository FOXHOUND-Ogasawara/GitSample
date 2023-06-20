/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building{

    private int numOffices;

    public OfficeBuilding(String name,int floors,int numOffices){
        super(name,floors);
        this.numOffices = numOffices;
    }

    @Override
    public void show(){
        super.show();
        System.out.println(numOffices+"建ての建物です｡");
    }

    @Override
    public void open() {
        System.out.println("オフィスビルのエントランスを開けて入室します｡");
    }

    @Override
    public void close() {
        System.out.println("オフィスビルのエントランスを閉めて退出します｡");
    }
    
}