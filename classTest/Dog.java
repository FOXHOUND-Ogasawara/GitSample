public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark(){
        System.out.println(super.getName() + "はワンと鳴きます。" );
    }

}