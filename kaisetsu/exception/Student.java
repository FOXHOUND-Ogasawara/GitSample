package kaisetsu.exception;

public class Student {
  public Homework doHomework(String title) {
    NotePc pc = new NotePc();
    Homework homework = pc.createHomework(title);
    return homework;
  }
}
