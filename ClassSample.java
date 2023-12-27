public class ClassSample {
    // フィールド
    private String name;
    private int age;

    // コンストラクタ
    public ClassSample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void showProperties(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }
}

product/XX?textValue=XX