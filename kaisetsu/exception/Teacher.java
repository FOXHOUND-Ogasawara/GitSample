package kaisetsu.exception;

public class Teacher {
    public static void main(String[] args) throws SpecException{
        String issue = "動画作成課題";
        Student student = new Student();
        Homework homework = student.doHomework(issue);

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