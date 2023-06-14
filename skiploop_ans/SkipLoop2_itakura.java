import javax.lang.model.util.ElementScanner6;

public class SkipLoop2
{
    public static void main(String[] args) 
    {

        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int countE = 0;
        int countO = 0;

        for(int i = 0; i < 100; i++)
        {
            // continueやbreak文を使った処理
            if (i % 3 != 0 && countE < 10 && countO < 10)
            {
                continue;
            }
            else if (evenNumbers[countE] % 2 == 0)
            {
                evenNumbers[countE] = i;
                countE++;
            }
            else if (oddNumbers[countO] % 2 != 0)
            {
                oddNumbers[countO] = i;
                countO++;
            }
            else 
            {
                
            }
        }

        System.out.println("EvenNumbers is ...");
        for (int i = 0; i < countE; i++) {
            System.out.println(evenNumbers[i] + " ");
        }

        System.out.println("OddNumbers is ...");
        for (int i = 0; i < countO; i++) {
            System.out.println(oddNumbers[i] + " ");
        }
    }
}
