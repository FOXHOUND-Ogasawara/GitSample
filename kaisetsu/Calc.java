public class Calc {
    public int num1;
    public int num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addA() {
        System.out.println(this.num1 + this.num2);
    }

    public int addB() {
        return this.num1 + this.num2;
    }
}
