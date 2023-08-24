import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Bank{
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    private Map<Integer,String> menu = new HashMap<Integer, String>();

    private ATM atm = new ATM();

    private Map<String, String> user = new HashMap<String, String>();

    public Bank(){
        user.put("name", "taro");
        user.put("balance", "10000");
        menu.put(1,"ATM 利用");
        menu.put(2,"終了");
    }

    private void showMenu(Map<Integer, String> menu) {
        menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
        System.out.println();
    }

    private int inputMenu(Map<Integer, String> menu){
        while(true){
            this.showMenu(menu);
            int input = this.inputNum();

            if(input > 0 && input <= menu.size()){
                return input;
            }

            System.out.println("該当する半角数字で入力してください");
        }
    }

    private int inputNum(){
        try{
            return Integer.parseInt(BR.readLine());
        }catch(NumberFormatException | IOException e){
            return 0;
        }
    }

    public void selectMenu(){
        System.out.println("いらっしゃいませ、ようこそ SLS銀行へ");
        boolean isFinished = true;
        while(isFinished){
            int inputMenu = this.inputMenu(this.menu);
            switch (inputMenu){
                case 1:
                    this.useATM();
                    break;
                case 2:
                    System.out.println("ご利用ありがとうございました、 またのご利用お待ちしております。");
                    isFinished = false;
                    break;
            }
        }
    }

    private void useATM(){
        this.atm.setUser(this.user);
        // ATM利用終了後はフィールドのuserを上書き
        user = this.atm.selectMenu();
    }
}