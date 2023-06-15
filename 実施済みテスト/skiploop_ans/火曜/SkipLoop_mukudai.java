public class SkipLoop_mukudai {
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
            if (i == 0){
                continue;
            }
            if (i % 3 == 0){
                continue;
            }
            if (countE == 10 && countO == 10){
                break;
            }
            if (i % 2 == 1){
                for (int j = oddNumbers.length; j < oddNumbers.length + 1; j++){ // やりたいことは分かるけど、初期値が間違ってる
                    System.out.println(j);
                    oddNumbers[j] = i;
                    countO += 1;
                }
            }
            else if (i % 2 == 0){
                for (int j = evenNumbers.length; j < evenNumbers.length + 1; j++){
                    evenNumbers[j] = i;
                    countE += 1;
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
