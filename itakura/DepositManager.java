package itakura;

public class DepositManager {
    private int deposit = 0;

    public void setDeposit(int deposit) {
        this.deposit += deposit;
    }

    public int getDeposit() {
        return this.deposit;
    }

    public int getReturn(int change) {
        this.deposit = 0;
        return change;
    }
}
