package skillTest.skillTest_nozaki;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
    
    private static List<Animal> animals = new ArrayList<Animal>();

    public Zoo() {
        animals.add(new Animal());
        animals.add(new SeaAnimal());
    }

    public static void setAnimals(List<Animal> animals) {
        Zoo.animals = animals;
    }

    public static void showAimals() {
        for(Animal animal : animals) {
            animal.showProperties();
            System.out.println();
        }
    }
    


}
