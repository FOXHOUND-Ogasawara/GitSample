package Sample;
public class GradeChecker {
    public static void main(String[] args) {
        int score = 40;

        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("成績: " + grade);
    }
}