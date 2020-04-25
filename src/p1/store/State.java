package p1.store;

import p1.Entity.Customer;

import java.util.ArrayList;

public class State {
    Node currentNode;
    boolean isEnd;
    ArrayList<Action> possibleActions;
    Customer currentCustomer;
    ArrayList<Customer> customers;

    public Node getCurrentNode() {
        return currentNode;
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
