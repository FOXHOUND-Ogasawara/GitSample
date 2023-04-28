package SampleA;

public class Sample {

    public static void main(String[] args) {
        String words[][] = {
                { "a", "bc", "!!" },
                { "He", "l" },
                { "lo", "!", "def" }
        };

        System.out.print(words[1][0]);
        System.out.print(words[1][1]);
        System.out.print(words[2][0]);
        System.out.print(words[0][2]);
    }
}
