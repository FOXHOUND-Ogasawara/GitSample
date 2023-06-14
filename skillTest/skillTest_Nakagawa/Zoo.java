//問3
import java.util.ArrayList;
import java.util.List;

class Zoo {
  private static List<Animal> animals = new ArrayList<>();
  private static List<SeaAnimal>seaAnimals = new ArrayList<>();


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