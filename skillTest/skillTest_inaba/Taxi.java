package skillTest.skillTest_inaba;
public class Taxi extends Car {
    public int meter;

    public Taxi() {
        this.meter = 660;
    }

    public void addMeter(int meter){
        this.meter += meter;
        System.out.println("料金メータ; " + this.meter);
    }
}
