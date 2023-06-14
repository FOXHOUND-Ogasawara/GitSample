public class Main {
    public static void main(String[] args) {
        Trainee[] trainees = new Trainee[5];
        Trainer trainer = new Trainer("小笠原");

        String[] name = { "田中", "鈴木", "山田", "佐藤", "加藤" };
        int[] age = { 23, 25, 30, 33, 24 };
        String[] skill = {"Java", "Java/JavaScript", "Java/JavaScript/Git", "Java/JavaScript/Git/SpringBoot", "Java/JavaScript/Git/SpringBoot/JUnit"};

        for(int i = 0;i<trainees.length;i++)
        {
            trainees[i] = new Trainee(name[i], age[i], skill[i]);
        }

        trainer.setTrainees(trainees);

        System.out.println("トレーナー：" + trainer.getName());

        for(int i = 0; i < trainees.length;i++){
           Trainee trainee = trainer.showTrainee(i);
            System.out.println("氏名：" + trainee.getName());
            System.out.println("年齢" + trainee.getAge());
            System.out.println("所有スキル：" + trainee.getSkill());
        }
    }
}
