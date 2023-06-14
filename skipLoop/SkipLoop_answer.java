public class SkipLoop_answer {
    public static void main(String[] args) {

        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int countE = 0;
        int countO = 0;

        for (int i = 0; i < 100; i++) {
            if (countE == evenNumbers.length && countO == oddNumbers.length) {
                break;
            }

            if (i % 3 == 0) {
                continue;
            } else if (i % 2 == 0) {
                evenNumbers[countE] = i;
                countE++;
            } else {
                oddNumbers[countO] = i;
                countO++;
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
