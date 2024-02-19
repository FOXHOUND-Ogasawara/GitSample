package kaisetsu.keishoKaisetsu;

public class Item {

    private String name;
    private String category;

    public Item(){}

    public Item(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void showItem() {
        System.out.println("カテゴリー:" + this.category);
        System.out.println("アイテム名:" + this.name);
    }

}
