package kaisetsu.kaisetsu_object;

public class Sample {
    public static void main(String[] args) {

        Member member = new Member();

        member.name = "山田太郎";
        member.age = 22;

        System.out.println(Const.NAME_OUT + member.name);

        // String name = "";

        // name = "山田太郎";

        // System.out.println("名前：" + name);

        // name = "鈴木太郎";

        // System.out.println("名前：" + name);

        // int age;

        // age = 22;

        // System.out.println("名前：" + name);
        // System.out.println("年齢：" + age);
    }
}
