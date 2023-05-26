public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark(){
        System.out.println(super.getName() + "はニャーと鳴きます。" );
    }

}
