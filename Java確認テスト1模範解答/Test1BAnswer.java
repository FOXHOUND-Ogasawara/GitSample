class Vehicle {

  public void introduction() {
    System.out.println("一般的な乗り物です。");
  }
}

class Car extends Vehicle {

  @Override
  public void introduction() {
    System.out.println("車です。");
  }
}

class Bike extends Vehicle {

  @Override
  public void introduction() {
    System.out.println("バイクです。");
  }
}

class Garage {

  Vehicle[] vehicles = new Vehicle[3];

  public Garage() {
    vehicles[0] = new Vehicle();
    vehicles[1] = new Car();
    vehicles[2] = new Bike();
  }
}

class InheritanceTest {

  public static void main(String[] args) {
    Garage garage = new Garage();
    for (int i = 0; i < garage.vehicles.length; i++) {
      garage.vehicles[i].introduction();
    }
  }
}
