public class SkipLoop {
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
            for(int j = 0; j < 100; j++){
                if(j %3 == 0){
                    continue;
                } else if (j %2 == 0){
                    j = evenNumbers[i];
                    countE++;
                    if(countE == 10){
                        continue;
                    }
                } else if(j %2 == 1){
                    j = oddNumbers[i];
                    countO++;
                    if(countO == 10){
                        continue;
                    }
                } else {
                    break;
                }
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
