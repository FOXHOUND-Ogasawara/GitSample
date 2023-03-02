package Sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> cardList = new ArrayList<>();
        
        for(int i = 0;i < cardList.size(); i++){
            // 処理
            cardList.get(i);
        }

        for(int value : cardList){
            // 処理
            value
        }
    }
}
