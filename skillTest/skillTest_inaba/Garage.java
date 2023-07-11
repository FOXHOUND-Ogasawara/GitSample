package skillTest.skillTest_inaba;
import java.util.List;
import java.util.ArrayList;

public class Garage {
    public static List<Car> cars = new ArrayList<>();

    public static void setCars(Car car){
        cars.add(car);
    }

    public static void displayCars(){
        cars.forEach(car->{
            car.print();
        });
    }
}
