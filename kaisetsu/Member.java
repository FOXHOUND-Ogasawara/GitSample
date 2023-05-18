class Member {
    private String name = "";
    private int age = -1;

    // Q9
    private static int member = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("不正な値です");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void showProperties() {
        System.out.println("名前: " + this.getName());
        System.out.println("年齢: " + this.getAge() + "歳");
    }

    public Member() {
        System.out.println("インスタンスが生成されました。");

        // Q9
        member++;
    }

    public Member(String name, int age) {
        this();
        setName(name);
        setAge(age);
    }

    // Q10
    public static void showMember() {
        System.out.println("メンバーの人数は" + member + "人です");
    }
 }