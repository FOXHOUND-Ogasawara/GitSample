public class ReturnMethod {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isOddNumber(num));
    }

    public static String isOddNumber(int num){

        if(num % 2 == 0){
            return "偶数";
        }
        else if(num % 2 == 1){
            return "奇数";
        }

        return "不正な値です";
    }

}
