package c6.z7;

public class Purchase {
    private String name;
    private int price;

    public Purchase(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + "zl";
    }
}
