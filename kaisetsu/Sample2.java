class Sample2 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        String text = "あああああ";
        boolean boolValue = true;

        // if (number1 <= 0 || number1 > 10) {
        //     System.out.println("範囲外の入力値です");
        //     return;
        // }

        // for (int i = 0; i < number1; i++) {
        //     System.out.println(text);
        // }

        // if (number2 <= 0 || number2 > 10) {
        //     System.out.println("範囲外の入力値です");
        //     return;
        // }

        // for (int i = 0; i < number2; i++) {
        //     System.out.println(text);
        // }

        repeat(number1, text);
        repeat(number2, text);

    }

    public static void repeat(int loopCount, String text) {

        if (loopCount <= 0 || loopCount > 10) {
            System.out.println("範囲外の入力値です");
            return;
        }

        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }
}