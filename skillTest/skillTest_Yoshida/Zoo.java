import java.util.ArrayList;
import java.util.List;

public class Zoo {
    //Q3
    private static List<Animal> animals = new ArrayList<>();

    public static void setAnimals(Animal animal){
        animals.add(animal);
    }
    public static void showAnimals(){
       animals.forEach(animal -> ((Animal) animal).showProperties());
    }
}
