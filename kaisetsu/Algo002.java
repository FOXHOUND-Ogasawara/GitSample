package kaisetsu;

public class Algo002 {
    public static void main(String[] args) {
        String str1 = "god";
        String str2 = "dog";
        System.out.println(permutation(str1, str2));
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        char[] t_array = t.toCharArray();
        for (char c : t_array) {
            if(--letters[c] < 0){
                return false;
            }
        }


        // for (int i = 0; i < t.length(); i++) {
        //     int c = (int) t.charAt(i);
        //     if (--letters[c] < 0) {
        //         return false;
        //     }
        // }
        return true;
    }
}
