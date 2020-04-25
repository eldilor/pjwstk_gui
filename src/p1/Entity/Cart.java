package p1.Entity;

import p1.utils.PurchaseListFormatter;

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

    public void empty() {
        this.customer = null;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Twój Koszyk:\n" + PurchaseListFormatter.format(purchases);
    }
}
