public class ExeTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        Cat cat = new Cat("猫");
        cat.bark();

        animals[0] = new Cat("猫");
        animals[1] = new Dog("犬");

        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }
    }
}
