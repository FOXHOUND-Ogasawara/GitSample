//Q1
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProperties() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
    }
}
