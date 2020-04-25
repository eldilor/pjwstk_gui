package p1.store;

import java.util.ArrayList;

public class Store {
    private static State state;

    public static void createStore() {
        state = new State();
        state.message = NodeType.START.getName();
        state.possibleActions = new ArrayList<>();

        state.possibleActions.add(Action.START_END);
        state.possibleActions.add(Action.START_SHOP);
        state.possibleActions.add(Action.START_REPORT);
    }

    public static void dispatch(Action action) {
        if (state == null) createStore();

        switch (action) {
            case START_SHOP:
                start_shop();
                break;
            case START_REPORT:
                start_report();
                break;
            case SHOP_START:
                shop_start();
                break;
            case SHOP_BUY:
                shop_buy();
                break;
            case SHOP_CART:
                shop_cart();
                break;
            case SHOP_CHECKOUT:
                shop_checkout();
                break;
            case BUY_SHOP:
                buy_shop();
                break;
            case BUY_CART:
                buy_cart();
                break;
            case CART_SHOP:
                cart_shop();
                break;
            case CART_CHECKOUT:
                cart_checkout();
                break;
            case CHECKOUT_START:
                checkout_start();
                break;
            case CHECKOUT_SHOP:
                checkout_shop();
                break;
            case REPORT_START:
                report_start();
                break;
            case START_END:
            case SHOP_END:
            case REPORT_END:
                end();
        }
    }

    public static State getState() {
        return state;
    }

    private static ArrayList<Action> getStartPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.START_END);
        possibleActions.add(Action.START_SHOP);
        possibleActions.add(Action.START_REPORT);

        return possibleActions;
    }

    private static ArrayList<Action> getShopPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.SHOP_END);
        possibleActions.add(Action.SHOP_START);
        possibleActions.add(Action.SHOP_BUY);
        possibleActions.add(Action.SHOP_CART);
        possibleActions.add(Action.SHOP_CHECKOUT);

        return possibleActions;
    }

    private static ArrayList<Action> getReportPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.REPORT_END);
        possibleActions.add(Action.REPORT_START);

        return possibleActions;
    }

    private static ArrayList<Action> getBuyPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.BUY_SHOP);
        possibleActions.add(Action.BUY_CART);

        return possibleActions;
    }

    private static ArrayList<Action> getCartPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.CART_SHOP);
        possibleActions.add(Action.CART_CHECKOUT);

        return possibleActions;
    }

    private static ArrayList<Action> getCheckoutPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.CHECKOUT_SHOP);
        possibleActions.add(Action.CHECKOUT_START);

        return possibleActions;
    }

    private static void start_shop() {
        state.message = NodeType.SHOP.getName();
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void start_report() {
        state.message = NodeType.REPORT.getName();
        state.possibleActions = getReportPossibleActionTypes();
    }

    private static void shop_start() {
        state.message = NodeType.START.getName();
        state.possibleActions = getStartPossibleActionTypes();
    }

    private static void shop_buy() {
        state.message = NodeType.BUY.getName();
        state.possibleActions = getBuyPossibleActionTypes();
    }

    private static void shop_cart() {
        state.message = NodeType.CART.getName();
        state.possibleActions = getCartPossibleActionTypes();
    }

    private static void shop_checkout() {
        state.message = NodeType.CHECKOUT.getName();
        state.possibleActions = getCheckoutPossibleActionTypes();
    }

    private static void buy_shop() {
        state.message = NodeType.SHOP.getName();
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void buy_cart() {
        state.message = NodeType.CART.getName();
        state.possibleActions = getCartPossibleActionTypes();
    }

    private static void cart_shop() {
        state.message = NodeType.SHOP.getName();
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void cart_checkout() {
        state.message = NodeType.CHECKOUT.getName();
        state.possibleActions = getCheckoutPossibleActionTypes();
    }

    private static void checkout_start() {
        state.message = NodeType.START.getName();
        state.possibleActions = getStartPossibleActionTypes();
    }

    private static void checkout_shop() {
        state.message = NodeType.SHOP.getName();
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void report_start() {
        state.message = NodeType.START.getName();
        state.possibleActions = getStartPossibleActionTypes();
    }

    private static void end() {
        state.isEnd = true;
    }
}
