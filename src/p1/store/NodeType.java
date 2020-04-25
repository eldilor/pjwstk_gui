package p1.store;

public enum NodeType {
    START("Menu główne"),
    REPORT("Raport"),
    SHOP("Sklep"),
    BUY("Kup"),
    CART("Koszyk"),
    CHECKOUT("Kasa"),
    END("Zakończ program");

    private String name;

    NodeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
