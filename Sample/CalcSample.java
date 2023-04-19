public class CalcSample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        boolean flg = true;

        System.out.println(getResult(num2, flg));
    }

    public static int getResult(int num, boolean flg){
        if(flg == true){
          return  num ++;
        }
        else {
           return num --;
        }
    }


}