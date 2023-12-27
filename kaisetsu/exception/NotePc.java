package kaisetsu.exception;

public class NotePc {
  public Homework createHomework(String title) throws SpecException {
    if (title.equals("動画作成課題")) {
      throw new SpecException("容量が足りません。"); // 1. 例外が発生
     }
    return new Homework(title);
   }
}
