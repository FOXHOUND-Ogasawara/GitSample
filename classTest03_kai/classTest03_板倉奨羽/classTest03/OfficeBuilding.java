/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding extends Building{
    private String name;
    private int floors;
    private int numOffices;

    public void OfficeBuilding(String name, int floors, int numOffices)
    {
        super(name, floors);
        this.numOffices = numOffices;
    }

    public void setOfficeBuilding(int numOffices)
    {
        this.numOffices = numOffices;
    }

    public int getOfficeBuilding()
    {
        return this.numOffices;
    }

    @Override
    public void show()
    {
        System.out.println("100個のテナントが入っています。");
        super.show();
    }

    public void open()
    {
        System.out.println("オフィスビルのエントランスを開けて入室します。");
    }

    public void close()
    {
        System.out.println("オフィスビルのエントランスを閉めて退出します。");
    }
}