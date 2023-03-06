public class SkillTest {
    public static void main(String[] args) {
        //Q4
        Animal panda = new Animal("パンダ", 12);
        SeaAnimal same = new SeaAnimal("ジンベエザメ", 22, 3);
        
        Zoo.setAnimals(panda);
        Zoo.setAnimals(same);
        
        Zoo.showAnimals();
        }
}
