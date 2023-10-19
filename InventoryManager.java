import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Item> items = new ArrayList<Item>();
        List<Object> sampleItemData = new ArrayList<Object>();
        sampleItemData.add("マウス");
        sampleItemData.add(15000);
        try {
            Item sampleItem = new Item(sampleItemData);
            items.add(sampleItem);
            while (true) {
                System.out.println("1. 商品追加");
                System.out.println("2. 商品一覧表示");
                System.out.println("3. 商品削除");
                System.out.println("4. 終了");
                System.out.print("選択してください: ");
                int choice = Integer.parseInt(reader.readLine());

                if (choice == 1) {
                    System.out.print("商品の名前を入力してください: ");
                    String name = reader.readLine();

                    System.out.print("商品の価格を入力してください: ");
                    int price = Integer.parseInt(reader.readLine());

                    // Q4 商品の追加処理を呼び出して動作確認
                    addItem(items, name, price);
                } else if (choice == 2) {
                    // Q3 商品の一覧表示処理を呼び出して動作確認
                    displayItems(items);
                } else if (choice == 3) {
                    System.out.print("削除する商品の番号を入力してください: ");
                    int itemIndex = Integer.parseInt(reader.readLine()) - 1;
                    // Q5 商品の削除処理を呼び出して動作確認
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("無効な選択です。");
                }
            }
            // Q2 catchの()内に数値、入力の例外処理を実装してください。
        } catch (NumberFormatException | IOException e) {
            System.out.println("無効な入力です。");
            // Q2 catchの()内に不正な引数の例外処理を実装してください。
        } catch (IllegalArgumentException e) {
            System.out.println("データが不正です。");
        } finally {
            System.out.println("プログラムを終了します。");
        }
    }

    // Q4 addItemメソッドを実装してください
    static void addItem(List<Item> items, String name, int price) {
        List<Object> addItems = new ArrayList<Object>();
        addItems.add(name);
        addItems.add(price);
        Item AddItems = new Item(addItems);
        items.add(AddItems);
        System.out.println("商品が追加されました。");
        displayItems(items);
    }

    // Q3 displayItemsメソッドを実装してください
    static void displayItems(List<Item> items) {
        System.out.println("商品一覧:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ": " + items.get(i).showItem());
        }
    }
    // Q5 removeItemメソッドを実装してください
}

// Q1 Itemクラスを実装してください
class Item {
    // 処理
    private String name;
    private int price;

    public Item(List<Object> itemData) {
        if (itemData.size() != 2) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < itemData.size(); i++) {
            if (itemData.get(i) instanceof String) {
                this.name = (String) itemData.get(i);
            } else if (itemData.get(i) instanceof Integer) {
                this.price = (int) itemData.get(i);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public String showItem() {
        return "商品: " + name + " 価格: " + price;
    }
}