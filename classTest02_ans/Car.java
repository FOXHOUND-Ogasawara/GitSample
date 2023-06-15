public class Car extends Vehicle {
    private int numDoors;

    public Car(String model, int year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ドアの数:" + this.numDoors);
    }

    @Override
    public void start() {
        System.out.println("エンジンをかけて走行します。");
    }

    @Override
    public void stop() {
        System.out.println("エンジンを停止して停車します。");
    }
}
