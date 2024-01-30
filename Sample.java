import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample {
    public static void main(String[] args) {
        try {
            System.out.println(method1());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // NumberFormatExceptionが発生した場合、呼び出し元に例外処理を任せます
    public static int method1() throws NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            // lineの値によってはint型に変換できず例外発生
            int ret = Integer.parseInt(line);
            return ret;
            // ret = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;

    }
}