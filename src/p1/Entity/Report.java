package p1.Entity;

import p1.utils.PriceFormatter;

import java.util.ArrayList;
import java.util.Collections;

public class Report {
    ArrayList<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public int getTotal() {
        return bills.stream().mapToInt(Bill::getTotal).sum();
    }

    public int getBillsCount() {
        return bills.size();
    }

    public int getCustomerCount() {
        return (int) bills.stream()
                .map(bill -> bill.getCustomer().getName())
                .distinct()
                .count();
    }

    @Override
    public String toString() {
        ArrayList<Bill> sortedBills = new ArrayList<>(bills);
        Collections.sort(sortedBills);
        String transactions = "";

        for (int i = 0; i < sortedBills.size(); i++) {
            transactions += "  " + (i + 1) + ". " + sortedBills.get(i).getCustomer().getName() + " - " + PriceFormatter.format(sortedBills.get(i).getTotal()) + "\n";
        }

        return "Liczba rachunków: " + getBillsCount() + "\n" +
                "Suma rachunków: " + PriceFormatter.format(getTotal()) + "\n" +
                "Liczba klientów: " + getCustomerCount() + "\n" +
                "Historia transakcji: \n" + transactions + "\n";
    }
}
