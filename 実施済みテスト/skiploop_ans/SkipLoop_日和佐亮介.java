public class SkipLoop_日和佐亮介 {
    public static void main(String[] args) {

        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int countE = 0;
        int countO = 0;

        for(int i = 0; i < 100;i++){
            /*
             * 偶数をevenNumbersに格納していく
             * 奇数をoddNumbersに格納していく
             * ただし、3の倍数は格納しない
             * それぞれ10個の数値を格納したら処理を終える
             */
             if(i % 3 == 0){
                continue;
             }
             if(i % 2 == 0){
                evenNumbers[countE]=i;
                countE++;
             }else{
                oddNumbers[countO]=i;
                countO++;
             }

             if(countE >= 10 && countO >= 10 ){
                break;
             }
        }

        System.out.println("EvenNumbers is ...");
        for (int i = 0; i < countE; i++) {
            System.out.println(evenNumbers[i]);
        }

        System.out.println("OddNumbers is ...");
        for (int i = 0; i < countO; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
