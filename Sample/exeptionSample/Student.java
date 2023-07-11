package Sample.exeptionSample;
public class Student {
    // 3.
    public Homework doHomework(String title) throws SpecException{
        NotePc pc = new NotePc();
        Homework homework = pc.createHomework(title);
        return homework;
    }
}
