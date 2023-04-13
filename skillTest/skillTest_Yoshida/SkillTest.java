package skillTest.skillTest_Yoshida;

public class SkillTest {
    public static void main(String[] args) {
        //Q1
        Animal animal = new Animal("パンダ", 12);
        animal.showProperties();

        //Q2
        SeaAnimal seaAnimal = new SeaAnimal("ジンベエザメ", 22, 3);
        seaAnimal.showProperties();

        //Q3
        Zoo.setAnimals(animal);
        Zoo.setAnimals(seaAnimal);
        Zoo.showAnimals();

        //Q4
        Question4.showAll();
    }
}