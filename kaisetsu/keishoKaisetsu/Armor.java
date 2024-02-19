package kaisetsu.keishoKaisetsu;

public class Armor extends Item{

    private String explanation;
    private int defensePower;

    public Armor(){}

    public Armor(String name, String category, String explanation, int defencePower){
        super(name, category);
        this.explanation = explanation;
        this.defensePower = defencePower;
    }

    @Override
    public void showItem(){
        super.showItem();
        System.out.println("防御力:" + this.defensePower);
        System.out.println("アイテム説明:" + this.explanation);
    }

}
