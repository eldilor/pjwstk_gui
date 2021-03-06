package p1.store;

import p1.Entity.CheckOut;
import p1.Entity.Customer;
import p1.Entity.Product;
import p1.Entity.Purchase;
import p1.Repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static State state;

    public static State createStore() {
        state = new State();
        state.currentNode = Node.START;
        state.possibleActions = new ArrayList<>();

        state.possibleActions.add(Action.START_END);
        state.possibleActions.add(Action.START_SHOP);
        state.possibleActions.add(Action.START_REPORT);

        state.customers = new ArrayList<>();
        state.checkout = new CheckOut();

        return state;
    }

    public static void dispatch(Action action) throws Exception {
        String methodName = action.getFrom().toString().toLowerCase() + "_" + action.getTo().toString().toLowerCase();
        Store.class.getDeclaredMethod(methodName).invoke(null);
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

    private static ArrayList<Action> getCartPossibleActionTypes() {
        ArrayList<Action> possibleActions = new ArrayList<>();

        possibleActions.add(Action.CART_SHOP);
        possibleActions.add(Action.CART_CHECKOUT);

        return possibleActions;
    }

    private static boolean confirm(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        System.out.println("[0] Anuluj");
        System.out.println("[1] Potwierdź");

        String in = scanner.nextLine();

        return in.equals("1");
    }

    private static void start_shop() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String customerName = scanner.nextLine();
        Customer currentCustomer = null;

        for (Customer customer : state.customers) {
            if (customer.getName().equals(customerName)) {
                currentCustomer = customer;
            }
        }

        if (currentCustomer == null) {
             currentCustomer = new Customer(customerName);
             state.customers.add(currentCustomer);
        }

        state.currentCustomer = currentCustomer;
        state.currentNode = Node.SHOP;
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void start_report() {
        System.out.println(state.checkout.getReport());
    }

    private static void shop_start() {
        if (!confirm("Czy na pewno chcesz wyjść ze sklepu?")) return;

        state.currentNode = Node.START;
        state.possibleActions = getStartPossibleActionTypes();
        state.currentCustomer = null;
    }

    private static void shop_buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz produkt:");

        String options = "  [0] Anuluj\n";
        ArrayList<Product> products = ProductRepository.getAll();

        for (int i = 0; i < products.size(); i++) {
            options += "  [" + (i + 1) + "] " + products.get(i) + "\n";
        }

        System.out.println(options);
        int chosenOption = scanner.nextInt();

        if (chosenOption == 0) return;

        System.out.println("Podaj ilość:");
        int quantity = scanner.nextInt();

        if (quantity == 0) return;

        Purchase purchase = new Purchase(products.get(chosenOption - 1), quantity);
        state.currentCustomer.getCart().addPurchase(purchase);

        System.out.println("Dodano do koszyka: \n  " + purchase);
    }

    private static void shop_cart() {
        System.out.println(state.currentCustomer.getCart() + "\n");

        state.currentNode = Node.CART;
        state.possibleActions = getCartPossibleActionTypes();
    }

    private static void shop_checkout() {
        checkout();
    }

    private static void cart_checkout() {
        checkout();
    }

    private static void checkout() {
        if (state.currentCustomer.getCart().isEmpty()) {
            System.out.println("Koszyk jest pusty!");
            return;
        }

        if (!confirm("Czy na pewno chcesz przejść do kasy?")) return;

        System.out.println("\nTwój rachunek:");
        System.out.println(state.checkout.checkout(state.currentCustomer));

        state.currentNode = Node.START;
        state.possibleActions = getStartPossibleActionTypes();
        state.currentCustomer = null;
    }

    private static void cart_shop() {
        state.currentNode = Node.SHOP;
        state.possibleActions = getShopPossibleActionTypes();
    }

    private static void start_end() {
        end();
    }

    private static void shop_end() {
        end();
    }

    private static void end() {
        if (!confirm("Czy na pewno chcesz zamknąć program?")) return;

        state.isEnd = true;
    }
}
