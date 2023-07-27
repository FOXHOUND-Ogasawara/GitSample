package classKadai072501;

public class Main {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char targetChar = 'l';

        // 文字列を逆順に変換して表示
        String reversedString = StringUtils.reverseString(originalString);
        System.out.println("元の文字列: " + originalString);
        System.out.println("逆順の文字列: " + reversedString);

        // 指定文字の出現回数をカウントして表示
        int occurrenceCount = StringUtils.countOccurrences(originalString, targetChar);
        System.out.println("'" + targetChar + "' の出現回数: " + occurrenceCount);
    }
}
