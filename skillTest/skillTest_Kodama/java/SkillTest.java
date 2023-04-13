package skillTest.skillTest_Kodama.java;

import java.util.ArrayList;
import java.util.List;

// Q1
class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showProperties(){
        System.out.println("名前：　" + this.name + "\n年齢：　" + this.age);
    }
}

// Q2
class SeeAnimal extends Animal{
    private int swimSpeed;

    public SeeAnimal(String name, int age, int swimSpeed){
        super(name, age);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void showProperties(){
        super.showProperties();
        System.out.println("泳ぐ速度：　" + this.swimSpeed + "km/h");
    } 
}

// Q3
class Zoo{
    private static List<Animal> animals = new ArrayList<>();

    public static void setAnimals(Animal animal){
        animals.add(animal);
    } 

    public static void showAnimals(){
        animals.forEach((animal)->{
            animal.showProperties();
            System.out.println();
        });
    }
}