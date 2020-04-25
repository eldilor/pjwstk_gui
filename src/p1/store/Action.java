package p1.store;

public enum Action {
    START_SHOP(NodeType.START, NodeType.SHOP),
    START_REPORT(NodeType.START, NodeType.REPORT),
    START_END(NodeType.START, NodeType.END),

    SHOP_START(NodeType.SHOP, NodeType.START),
    SHOP_BUY(NodeType.SHOP, NodeType.BUY),
    SHOP_CART(NodeType.SHOP, NodeType.CART),
    SHOP_CHECKOUT(NodeType.SHOP, NodeType.CHECKOUT),
    SHOP_END(NodeType.SHOP, NodeType.END),

    BUY_SHOP(NodeType.BUY, NodeType.SHOP),
    BUY_CART(NodeType.BUY, NodeType.CART),

    CART_SHOP(NodeType.CART, NodeType.SHOP),
    CART_CHECKOUT(NodeType.CART, NodeType.CHECKOUT),

    CHECKOUT_START(NodeType.CHECKOUT, NodeType.START),
    CHECKOUT_SHOP(NodeType.CHECKOUT, NodeType.SHOP),

    REPORT_END(NodeType.REPORT, NodeType.END),
    REPORT_START(NodeType.REPORT, NodeType.START);

    private NodeType from;
    private NodeType to;

    Action(NodeType from, NodeType to) {
        this.from = from;
        this.to = to;
    }

    public NodeType getFrom() {
        return from;
    }

    public NodeType getTo() {
        return to;
    }
}
