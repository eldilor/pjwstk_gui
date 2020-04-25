package p1.store;

public enum Action {
    START_SHOP(Node.START, Node.SHOP),
    START_REPORT(Node.START, Node.REPORT),
    START_END(Node.START, Node.END),

    SHOP_START(Node.SHOP, Node.START),
    SHOP_BUY(Node.SHOP, Node.BUY),
    SHOP_CART(Node.SHOP, Node.CART),
    SHOP_CHECKOUT(Node.SHOP, Node.CHECKOUT),
    SHOP_END(Node.SHOP, Node.END),

    BUY_SHOP(Node.BUY, Node.SHOP),
    BUY_CART(Node.BUY, Node.CART),

    CART_SHOP(Node.CART, Node.SHOP),
    CART_CHECKOUT(Node.CART, Node.CHECKOUT),

    CHECKOUT_START(Node.CHECKOUT, Node.START),
    CHECKOUT_SHOP(Node.CHECKOUT, Node.SHOP),

    REPORT_END(Node.REPORT, Node.END),
    REPORT_START(Node.REPORT, Node.START);

    private Node from;
    private Node to;

    Action(Node from, Node to) {
        this.from = from;
        this.to = to;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }
}
