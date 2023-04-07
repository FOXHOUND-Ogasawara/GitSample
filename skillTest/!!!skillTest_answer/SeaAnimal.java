package skillTest_answer;

// Q2
public class SeaAnimal extends Animal{
    private int swimSpeed;

    public SeaAnimal(String name, int age, int swimSpeed){
        super(name, age);
        this.swimSpeed = swimSpeed;
    }
    
    public void showProperties(){
        super.showProperties();
        System.out.println("泳ぐ速度：" + this.swimSpeed + "km/h");
    }
}
