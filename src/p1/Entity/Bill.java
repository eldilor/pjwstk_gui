package p1.Entity;

import p1.utils.DateFormatter;
import p1.utils.PurchaseListFormatter;

import java.util.ArrayList;
import java.util.Date;

public class Bill {
    private ArrayList<Purchase> purchases;
    private Customer customer;
    private Date date;

    public Bill(Cart cart) {
        this.purchases = cart.getPurchases();
        this.customer = cart.getCustomer();
        this.date = new Date();
    }

    @Override
    public String toString() {
        String string = "Klient: " + customer.getName();
        string += "\nData: " + DateFormatter.format(date);
        string += "\nLista zakupów:\n" + PurchaseListFormatter.format(purchases);

        return string;
    }
}
