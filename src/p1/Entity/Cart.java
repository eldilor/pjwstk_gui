package p1.Entity;

import p1.utils.PriceFormatter;

import java.util.ArrayList;

public class Cart {
    private Customer customer;
    private ArrayList<Purchase> purchases;

    public Cart(Customer customer) {
        this.customer = customer;
        this.purchases = new ArrayList<>();
    }

    public void addPurchase(Purchase newPurchase) {
        boolean isAlreadyInCart = false;

        for (Purchase purchase : purchases) {
            if (purchase.equals(newPurchase)) {
                purchase.increaseQuantity(newPurchase.getQuantity());
                isAlreadyInCart = true;
                break;
            }
        }

        if (!isAlreadyInCart) this.purchases.add(newPurchase);
    }

    @Override
    public String toString() {
        String purchasesString = "";
        int total = 0;

        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            purchasesString += "\t" + (i+1) + ". " + purchase + "\n";
            total += purchase.getProduct().getPrice() * purchase.getQuantity();
        }

        purchasesString += "--------------\nSuma:\n" + PriceFormatter.format(total);

        return "Twój Koszyk:\n" + purchasesString;
    }
}
