package kaisetsu;
public class Customer {
    public static void main(String[] args) {
        // 1 ラーメンを宣言する
        String orderMenu = "ラーメン";
        // 2 接客係にオーダーをする
            try {
                Food orderFood = Server.takeOrder(orderMenu);
                System.out.println(orderFood.getName() + "が運ばれて来ました。");
            } catch (KitchenException e) {
                System.out.println(e.getMessage());
                System.out.println("別の注文をする");
            }

            try {
                Food orderFood = Server.takeOrder(orderMenu);
                System.out.println(orderFood.getName() + "が運ばれて来ました。");
            } catch (KitchenException e) {
                System.out.println(e.getMessage());
                System.out.println("別の注文をする");
            }

        // 3 オーダー内容の確認
    }
}
