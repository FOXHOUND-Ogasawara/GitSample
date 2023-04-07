package SampleA;

public class Sample {

    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 5;

        int dif = num1 - num2;

        // difが偶数か奇数か0か判定したい

        if(dif % 2 == 0){
            System.out.println("偶数です");
        } else if(dif % 2  == 1) {
            System.out.println("奇数です");
        } else if(dif == 0) {
            System.out.println("0です");
        }

    }
}
