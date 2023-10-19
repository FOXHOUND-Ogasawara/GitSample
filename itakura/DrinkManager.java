package itakura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class DrinkManager {
    private static final String FILE = "itakura\\drinks.csv";
    private static final int NAME = 0;
    private static final int PRICE = 1;
    private static final int STOCK = 2;

    public static Map<Integer, Drink> getDrinksMap() {
        Map<Integer, Drink> drinks = new HashMap<Integer, Drink>();

        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(new FileInputStream(FILE), Charset.forName("UTF-8")))) {
            int count = 1;
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Drink drink = new Drink(
                    values[NAME],
                    Integer.parseInt(values[PRICE]),
                    Integer.parseInt(values[STOCK]));
                    drinks.put(count, drink);
                    count++;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("ファイルの読み込みに失敗しました");
        }
        return drinks;
    }
}
