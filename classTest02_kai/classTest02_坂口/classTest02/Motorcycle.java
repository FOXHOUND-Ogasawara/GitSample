/*
 * Vehicleクラスを継承して下記の通り実装をする
 * 1. フィールドにはサイドカーの有無を表す boolean型のhasSideCarを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */

public class Motorcycle extends Vehicle {
  boolean hasSideCar = true;
  public Motorcycle(String model, int year, int stop) {
    Vehicle v = new Vehicle(model, year);
    v.setModel(model);
    v.setYear(year);
  }
}