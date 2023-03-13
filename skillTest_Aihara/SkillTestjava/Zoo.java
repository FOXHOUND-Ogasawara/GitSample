import java.util.*;

//Q3
public final class Zoo {
    private static List<Animal> animals = new ArrayList<>();

    private Zoo() {
    }

    public static void setAnimals(Animal animal) {
        animals.add(animal);
    }

    public static void showAnimals() {
        for (Animal animal : animals) {
            animal.showProperties();
            System.out.println();
        }
    }
}