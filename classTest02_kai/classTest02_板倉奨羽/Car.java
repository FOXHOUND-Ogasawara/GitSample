/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle {
    private String model;
    private int year;
    private int numDoors;

    public Car(String model, int year, int numDoors)
    {
        this.model = model;
        this.year = year;
        this.numDoors = numDoors;
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

    public void setNumDoors(int numDoors)
    {
        this.numDoors = numDoors;
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

    @Override
    public int getNumDors()
    {
        return this.numDoors;
    }


    // 処理
    @Override
    public void show()
    {
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
        System.out.println("ドアの数:" + this.numDoors);
    }

    public void start()
    {
        System.out.println("エンジンをかけて走行します。");
    }

    public void stop()
    {
        System.out.println("エンジンを停止して停車します。");
    }
}
