package Sample.exeptionSample;
public class Teacher {
    public static void main(String[] args) {
        String issue = "動画作成課題";
        Student student = new Student();
        Homework homework = null;

        // 1. メインのtry~catch
        try {
            // 2. homeworkインスタンスに値を入れる
            homework = student.doHomework(issue);
            if (checkHomework(homework)) {
                System.out.println(homework.getContent() + "を採点します。");
            }
        } catch (SpecException e) {
            System.out.println(e.getMessage());
            System.out.println("PCを見せてください。");
        }
    }

    private static boolean checkHomework(Homework homework) {
        if (homework == null || homework.getContent().isEmpty()) {
            return false;
        }
        return true;
    }
}
