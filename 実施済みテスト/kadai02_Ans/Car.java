package 実施済みテスト.kadai02_Ans;

class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    @Override
    public void accelerate(int speed) {
        int currentSpeed = getSpeed();
        currentSpeed += speed;
        System.out.println("Car speed after acceleration: " + currentSpeed);
    }
}