package 実施済みテスト.kadai02_Ans;

class Bicycle extends Vehicle {
    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void accelerate(int speed) {
        int currentSpeed = getSpeed();
        currentSpeed += speed;
        System.out.println("Bicycle speed after acceleration: " + currentSpeed);
    }
}
