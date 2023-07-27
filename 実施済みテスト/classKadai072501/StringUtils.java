package classKadai072501;

public class StringUtils {
    // 文字列を逆順にするメソッド
    public static String reverseString(String original) {
        char[] chars = original.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    // 指定文字の出現回数をカウントするメソッド
    public static int countOccurrences(String original, char target) {
        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
