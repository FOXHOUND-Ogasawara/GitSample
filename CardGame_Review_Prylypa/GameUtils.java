//外側のクラスを追加する
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Pattern;

class GameUtils{
    //フィールド宣言
    //アルファベットのみで4~12文字
    private static final String REGEX_ALPHABET = "^[A-Za-z]{4,12}$";
    //デフォルト　コンストラクタ。内容なし。
    private GameUtils(){}

    //ユーザー入力取得。String型。String型じゃない場合はメインに例外管理を任せる
    public static String getInputString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try{
            str = br.readLine();
        }catch (IOException e){
            System.out.println("Input error...  Please retype!");
            getInputString();
        }
        return str;
    }

    //ユーザー入力取得。Int型。Int型じゃない場合はここで例外の管理が行う。何かの違うエラーが発生したしたら、メインに任せる。
    public static int getInputInt() {
        int num = 0;
        try {
            num = Integer.parseInt(getInputString());
        }catch (NumberFormatException e){
            System.out.println("Please enter an integer!");
            getInputInt();
        }
        return num;
    }
    //乱数数字をジェネレータ。最大記入。何かの違うエラーが発生したしたら、メインに任せる。
    public static int getRandomInt(int maxValue){
        Random rnd = new Random ();
        return rnd.nextInt(maxValue);
    }
    //記入されたString型はパターンに合ってるかどうか確認する。何かの違うエラーが発生したしたら、メインに任せる。
    public static boolean checkPattern(String targetStr)  {
        if(targetStr == null || targetStr.isEmpty() || targetStr.trim().isEmpty()){
            return false;
        }else{   
            return Pattern.matches(REGEX_ALPHABET,targetStr);
        }
    }
}