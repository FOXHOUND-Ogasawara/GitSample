package skillTest.skillTest_Yoshida;
public class Animal {
    //Q1
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  void showProperties(){
        System.out.println("名前: " + this.name);
        System.out.println("年齢: " + this.age);
    }
}
