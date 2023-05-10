package kaisetsu;

public class Algo001 {
    public static void main(String[] args) {
        String str = "abcadefg";
        System.out.println(isUniqueChars(str));
    }

    public static boolean isUniqueChars(String str) {
        // 【1】
        if (str.length() > 128)
            return false;
        // 【2】
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            // 【3】
            int val = str.charAt(i);

            // 【4】
            // if (char_set[val] == false) {
            //     char_set[val] = true;
            // } else if (char_set[val] == true) {
            //     return false;
            // }
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
