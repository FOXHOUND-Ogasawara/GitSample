package kaisetsu.exception;

public class NotePc {
    public Homework createHomework(String title) {
        try {
            if (title.equals("動画作成課題")) {
                throw new SpecException("容量が足りません。");
            }
        } catch (SpecException e) {
            System.out.println(e.getMessage());
            System.out.println("PCを見せてください。");
            return null;
        }
        return new Homework(title);
    }
}
