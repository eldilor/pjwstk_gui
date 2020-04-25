package p1.store;

import p1.Entity.Customer;

import java.util.ArrayList;

public class State {
    String message;
    boolean isEnd;
    ArrayList<Action> possibleActions;
    Customer currentCustomer;
    ArrayList<Customer> customers;

    public String getMessage() {
        return message;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public ArrayList<Action> getPossibleActions() {
        return possibleActions;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
