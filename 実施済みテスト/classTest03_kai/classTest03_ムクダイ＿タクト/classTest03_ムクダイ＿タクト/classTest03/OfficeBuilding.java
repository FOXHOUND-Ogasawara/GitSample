/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building {
    private String name;
    private int floors;
    private int numOffices;

    public OfficeBuilding(String name, int floors, int numOffices){
        super(name, floors);
        this.numOffices = numOffices;
    }

    @Override
    public show(){
        super.show();
        System.out.println(this.numOfices + "個のテナントが入っています。");

    }

    @Override
    public open(){
        System.out.println("オフィスビルのエントランスを開けて入室します。");
    }

    @Override
    public close(){
        System.out.println("オフィスビルのエントランスを閉めて退出します");
    }
    
}