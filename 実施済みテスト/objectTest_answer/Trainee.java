public class Trainee {
    /*
     * フィールドとして、name,age,skillを持っている
     * メソッドはコンストラクタと必要なgetter/setterのみ
     */
   private String name;
   private int age;
   private String skill;

    public Trainee(String name, int age, String skill){
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSkill() {
        return this.skill;
    }
}
