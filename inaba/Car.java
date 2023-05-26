public class Car {

    public int gasoline;
    public char direction;
    public int speed;

    public Car(){
        this.gasoline = 100;
        this.direction = 'N';
        this.speed = 0;
    }

    public void run(char direction, int speed){
        this.direction = direction;
        this.speed = speed;
        gasoline --;
    }

    public void turn(char direction){
        this.direction = direction;
        gasoline --;
    }

    public void stop(){
        speed = 0;
    }

    public void print(){
        System.out.println("方向: " + direction);
        System.out.println("速度: " + speed);
        System.out.println("燃料: " + gasoline);
        System.out.println();
    }
}



