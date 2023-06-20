/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehiccle{
    private String model;
    private int year;
    private boolean hasSideCar;

    public Motorcycle(String model, int year, boolean hasSideCar)
    {
        this.model = model;
        this.year = year;
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public void setYear(int year)
    {
        this.year = year;
    }

    public void setHasSideCar(boolean hasSideCar)
    {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String getModel()
    {
        return this.model;
    }

    @Override
    public int getYear()
    {
        return this.year;
    }

    public boolean getHasSideCar()
    {
        return this.hasSideCar;
    }

    @Override
    public void show()
    {
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
        System.out.println("サイドカーの有無:" + this.hasSideCar);
    }

    @Override
    public void start()
    {
        System.out.println("キックスタートしてエンジンを始動します。");
    }

    @Override
    public void stop()
    {
        System.out.println("エンジンを停止して停車します。");
    }
}