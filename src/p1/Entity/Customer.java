package p1.Entity;

import p1.Bill;

import java.util.ArrayList;

public class Customer {
    private String name;
    private Cart cart;
    private ArrayList<Bill> bills;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart(this);
        this.bills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }
}
