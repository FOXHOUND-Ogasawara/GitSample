

public class ExeTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat("タマ");
        animals[1] = new Dog("ポチ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].show();
        }
    }
}
