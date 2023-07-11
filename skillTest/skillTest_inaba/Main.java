package skillTest.skillTest_inaba;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi();
        // Taxi taxi = new Taxi();
        taxi.print();
        taxi.run('S',40);
        taxi.print();
        taxi.addMeter(5);

        Garage.setCars(car);
        Garage.setCars(taxi);
        Garage.displayCars();
    }
}