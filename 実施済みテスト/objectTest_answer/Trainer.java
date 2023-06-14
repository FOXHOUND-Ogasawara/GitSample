public class Trainer {
    /*
     * フィールドはname,Trainee型のtraineeのみ
     * メソッドはコンストラクタと必要なgetter/setterに加えて、トレーニー情報を返すshowTraineesメソッド
     */
    private String name;
    private Trainee[] trainees = new Trainee[5];

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTrainees(Trainee[] trainees) {
        this.trainees = trainees;
    }

    public Trainee showTrainee(int index) {
        return trainees[index];
    }
}