package keishoKaisetsu;

public class Game {
    public static void main(String[] args) {
        // キャラクリ開始
        Person player = new Person("太郎", "男性");

        // ゲーム開始直後の初期表示位置の設定
        Place place = new Place();

        System.out.println("ゲーム開始！ようこそ " + player.getName() + "さん");
        System.out.println("まず初めにあなたの情報を表示するよ");
        player.showPlayer();
        place.showPlace();

        System.out.println();

        System.out.println("装備品は装備しないと意味がないよ！装備してみよう");
        player.setEquipment(player.getItem());

        System.out.println("装備出来たことを確認しよう！");
        player.showPlayer();
    }

}
