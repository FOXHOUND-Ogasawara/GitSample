package ATM_prylypa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class CommonIO {

    public int getUserInput(int max){
		int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            num = Integer.parseInt(br.readLine());
			if(num > max || num < 1){
				System.out.println("1-" + max + "!");
				num = this.getUserInput(max);
			}
            
        }catch (NumberFormatException e){
            System.out.println("Please enter an integer! 1-" + max + "!");
            num = this.getUserInput(max);
        }catch (IOException e){
            System.out.println(e.getMessage());
            num = this.getUserInput(max);
        }
		
		return num;
	}

    public void showMenu(Map<Integer, String> menu) {
        menu.forEach((key, value) -> System.out.print(key + ":" + value + " "));
        System.out.println();
    }

}