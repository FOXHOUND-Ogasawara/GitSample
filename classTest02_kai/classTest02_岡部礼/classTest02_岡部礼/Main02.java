public class Main02 {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2022, 4);
        car.show();
        car.start();
        car.stop();

        System.out.println("----");

        Motorcycle motorcycle = new Motorcycle("Honda CB500X", 2021, false);
        motorcycle.show();
        motorcycle.start();
        motorcycle.stop();
    }

}
