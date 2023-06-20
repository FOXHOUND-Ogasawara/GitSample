/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはドアの数を表す int型のnumDoorsを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Car extends Vehicle {
  int numDoors;
  public Car(String model, int year, int stop) {
  Vehicle v = new Vehicle(model, year);
  v.setModel(model);
  v.setYear(year);

  public void start() {
    System.out.println("エンジンをかけて走行します。");
  }
      public void stop() {
        System.out.println("エンジンを停止して停車します。");
    }
}
}
