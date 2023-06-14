public class SkipLoop_HosokawaKouiti {
    public static void main(String[] args) {

        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int countE = 0;
        int countO = 0;

        // 日本語の理解力なし

        for(int i = 0; i < 100;i++){
        System.out.println("EvenNumbers is ...");
        for (int i = 0; i < countE; i++) {
            System.out.println(evenNumbers[i]);
        } if(i%2==0){
        else if(i%3==0){continue;
        }else if(i==10){break;
        }
        }if (i%2==1)
        System.out.println("OddNumbers is ...");
        for (int i = 0; i < countO; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
}