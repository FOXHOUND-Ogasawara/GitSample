public class SeaAnimal extends Animal{

    private int swimSpeed;

    public int getSwimSpeed() {
        return this.swimSpeed;
    }
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public SeaAnimal() {
        this("ジンベエザメ", 22, 3);
    }

    public SeaAnimal(String name, int age, int swimSpeed) {
        super(name,age);
        this.swimSpeed = swimSpeed;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("泳ぐ速度：" + swimSpeed + "km/h");
    }
    
}
