package kaisetsu.keishoKaisetsu;

public class Weapon extends Item{

    private String explanation;
    private int offencePower;

    public Weapon(){}

    public Weapon(String name, String category, String explanation, int offencePower){
        super(name, category);
        this.explanation = explanation;
        this.offencePower = offencePower;
    }

    @Override
    public void showItem(){
        super.showItem();
        System.out.println("攻撃力:" + this.offencePower);
        System.out.println("アイテム説明:" + this.explanation);
    }

}
