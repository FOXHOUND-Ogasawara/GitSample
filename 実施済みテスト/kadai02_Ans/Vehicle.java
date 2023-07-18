package kadai02_Ans;

abstract class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public abstract void accelerate(int speed);

    public int getSpeed() {
        return speed;
    }
}
