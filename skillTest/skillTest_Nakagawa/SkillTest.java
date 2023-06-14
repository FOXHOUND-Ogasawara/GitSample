class SkillTest {
  public static void main(String[] args) {

    Animal ani = new Animal("パンダ",12);
    ani.showProperties();

    SeaAnimal sea = new SeaAnimal("ジンベイザメ",22,3);
    sea.showProperties();
    //問4
    Zoo.setAnimals(ani);
    Zoo.setAnimals(sea);
    Zoo.showAnimals();

  }
}
