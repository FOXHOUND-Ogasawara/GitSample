package itakura;

public class Drink {
    private String name;
    private int price;
    private int stocks;

    public Drink(String name, int price, int stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStocks() {
        return this.stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }
}
