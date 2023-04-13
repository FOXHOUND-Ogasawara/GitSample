package skillTest.skillTest_nozaki;

public class Animal {
    private String name;
    private int age;

    public String getName () {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
        this("パンダ", 12);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProperties() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
    }
}
