public class BasicExam {
    public static void main(String[] args) {
        // for(int i = 1; i < 20; i++){
        // System.out.println("i = " + i + ": ●");
        // if(i % 2 == 0 && i % 3 == 0) {
        // System.out.println("i = " + i + ": @");
        // break;
        // } else {
        // if(i % 2 == 0){
        // System.out.println("i = " + i + ": ▲");
        // }
        // if(i % 3 == 0) {
        // System.out.println("i = " + i + ": ▼");
        // }
        // }
        // }
        // int num1 = 0;
        // int num2 = 0;

        // while (num1 < 11) {
        //     switch (num1 % 2) {
        //         case 0:
        //             num2 -= num1;
        //             System.out.println("num1 : " + num1 + ",num2 : " + num2);
        //             break;
        //         case 1:
        //             num2 += num1;
        //             System.out.println("num1 : " + num1 + ",num2 : " + num2);
        //             break;
        //         default:
        //             num2 *= 2;
        //             System.out.println("default:num1 : " + num1 + ",num2 : " + num2);
        //     }
        //     num1++;
        // }
        // System.out.println(num2);

        String str1 = "good";
        String str2 = "godo";
        System.out.println(permutation(str1, str2));
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for(int num : letters){
            System.out.print(num + " ");
        }

        char[] t_array = t.toCharArray();
        for(char c : t_array){
            if(--letters[c] < 0){
                return false;
            }
        }
        // for (int i = 0; i < t.length(); i++) {
        //     int c = (int)t.charAt(i);
        //     if(--letters[c] < 0) {
        //         return false;
        //     }
        // }
        return true;
    }

}
