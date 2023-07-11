public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
        this.show();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void show() {
        System.out.println("モデル:" + this.model);
        System.out.println("製造年:" + this.year);
    }

    public void start() {
        System.out.println("乗り物が始動しました。");
    }

    public void stop() {
        System.out.println("乗り物が停止しました。");
    }
}
