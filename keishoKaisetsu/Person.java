package keishoKaisetsu;

public class Person {

    private String name;
    private String gender;
    private Item[] item = new Item[3];

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
        this.item[0] = new ConsumptionItems("やくそう", "消耗品", "HPを10回復");
        this.item[1] = new Armor("かわのローブ", "防具", "防御力1", 1);
        this.item[2] = new Weapon("ひのきのぼう", "武器", "攻撃力5", 5);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setItem(Item item){
        this.item[0] = new ConsumptionItems("やくそう", "消耗品", "HPを10回復");
        this.item[1] = new Armor("かわのローブ", "防具", "防御力1", 1);
        this.item[2] = new Weapon("ひのきのぼう", "武器", "攻撃力5", 5);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Item[] getItem() {
        return item;
    }

    public void showPlayer() {
        System.out.println("プレーヤー名:" + this.name);
        System.out.println("性別:" + this.gender);
        System.out.println("持ち物:");
        for(int i = 0;i < item.length;i++){
            this.item[i].showItem();
            System.out.println();
        }
    }

    public void setEquipment(Item[] item) {
        item[1].setName(item[1].getName() + " E");
        item[2].setName(item[2].getName() + " E");
    }
}
