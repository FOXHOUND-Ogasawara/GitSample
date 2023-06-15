public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String model, int year, boolean hasSideCar) {
        super(model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("サイドカーの有無:" + this.hasSideCar);
    }

    @Override
    public void start() {
        System.out.println("キックスタートしてエンジンを始動します。");
    }

    @Override
    public void stop() {
        System.out.println("エンジンを停止して停車します。");
    }
}