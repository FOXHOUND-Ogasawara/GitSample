package kaisetsu.exception;

public class Teacher {

  public static void main(String[] args) {
    String issue = "動画作成課題";
    Student student = new Student();
    Homework homework = null;

    try {
      homework = student.doHomework(issue);
    } catch (SpecException e) { // 3. Studentクラスで投げられた例外をキャッチする
      System.out.println(e.getMessage());
      System.out.println("PCを見せてください。");
    }
    if (checkHomework(homework)) {
        System.out.println(homework.getContent() + "を採点します。");
      }
  }

  private static boolean checkHomework(Homework homework) {
    if (homework == null || homework.getContent().isEmpty()) {
      return false;
    }
    return true;
  }
}
