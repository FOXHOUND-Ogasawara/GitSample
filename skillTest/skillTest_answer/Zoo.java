package skillTest.skillTest_answer;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
   private static List<Animal> animals = new ArrayList<>();

   public static void setAnimals(Animal animal){
    animals.add(animal);
   }

   public static void showAnimals(){
    for(Animal animal : animals){
        animal.showProperties();
        System.out.print("\n");
    }
   }
}
