package skillTest.skillTest_answer;
// Q4
public class SkillTest {
    public static void main(String[] args) {
        Animal animal = new Animal("パンダ", 12);
        Animal seaAnimal = new SeaAnimal("ジンベエザメ", 22, 3);
        Zoo.setAnimals(animal);
        Zoo.setAnimals(seaAnimal);
        Zoo.showAnimals();
    }
}
