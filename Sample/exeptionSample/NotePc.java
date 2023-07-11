package Sample.exeptionSample;
public class NotePc {
    public Homework createHomework(String title) throws SpecException {
        if (title.equals("動画作成課題")) {
            throw new SpecException("容量が足りません。");
        }
        return new Homework(title);
    }
}
