package skillTest.skillTest_Kodama.java;

// Q4
class Main{
    public static void main(String[] args){
        Zoo.setAnimals(new Animal("パンダ", 12));
        Zoo.setAnimals(new SeeAnimal("ジンベエザメ", 22, 3));
        Zoo.showAnimals();
    }
}