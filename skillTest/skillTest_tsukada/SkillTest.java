import java.util.ArrayList;
import java.util.List;

class SkillTest{
    public static void main (String[] args){

        Animal animal = new Animal("パンダ",12);
        animal.showProperties();

        SeaAnimal seaAnimal = new SeaAnimal("ジンベイザメ",22,3);
        seaAnimal.showProperties();

        // Zoo zoo = new Zoo(animal);
        // zoo.showAnimals();

    }
}

//JAVAQ1
class  Animal{

    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name; //動物の名前
        this.age = age; //動物の年齢
    }

    public void showProperties(){
        System.out.println("名前：　" + name);
        System.out.println("年齢：　" + age);
    }
}

//JAVAQ2
class SeaAnimal extends Animal{

    private static int swimSpeed;

    public SeaAnimal(String name, int age, int swimSpeed){
        super(name, age);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void showProperties(){
        super.showProperties();
        System.out.println("泳ぐ速度：　" + swimSpeed + "km/h");
    }
}

//JAVAQ3
class Zoo {

    private static List<Animal> animals = new  ArrayList<Animal>();

    public static void setAnimals(Animal animal){
        animals.add(animal);
    }

    public static void showAnimals(){
        for (int i=0; i>animals.size(); i++){
            System.out.println(animals.get(i));  //.length()
        }
    }
}