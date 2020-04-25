package p1.Entity;

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

    public Bill checkout(CheckOut checkOut) {
        return checkOut.checkout(cart);
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    public void emptyCart() {
        this.cart = new Cart(this);
    }
}
