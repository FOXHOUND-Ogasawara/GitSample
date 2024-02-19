package kaisetsu.keishoKaisetsu;

public class ConsumptionItems extends Item{

    private String effect;

    public ConsumptionItems(){}

    public ConsumptionItems(String name, String category, String effect){
        super(name, category);
        this.effect = effect;
    }

    @Override
    public void showItem(){
        super.showItem();
        System.out.println("効果:" + this.effect);
    }

}
