public class ForKaisetsu {
    public static void main(String[] args) {

        // 基本的な使い方
        // for(ループカウンタ; ループ条件; 加算式)
        for(int i = 0;i < 10; i++){
            System.out.println(i);
        }

        // 加算式はなんでもOK
        for(int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        // 配列と組み合わせる時
        int[] nums = new int[10];
        // ループ条件を定数で与えるとバグが発生しやすいので配列を回すときは.lengthとするのが一般的
        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }

        for(int i = 0;i < 10 ; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
            else if(i == 8){
                break;
            }
        }
    }
}
