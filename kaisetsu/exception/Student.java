package kaisetsu.exception;

public class Student {
  public Homework doHomework(String title) throws SpecException {
    NotePc pc = new NotePc();
    Homework homework = pc.createHomework(title); // 2. NotePcクラスで発生した例外をまた投げる
    return homework;
   }
}
