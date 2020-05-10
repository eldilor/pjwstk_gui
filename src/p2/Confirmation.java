package p2;

import java.util.LinkedHashMap;

public class Confirmation {
    private int amount;
    private String message;
    private LinkedHashMap<Denoms, Integer> cash = new LinkedHashMap<>();

    public Confirmation(int amount, String message) {
        this.amount = amount;
        this.message = message;
    }

    public Confirmation(int amount, String message, LinkedHashMap<Denoms, Integer> cash) {
        this(amount, message);
        this.cash = new LinkedHashMap<>(cash);
    }

    public int getNumOfBills(Denoms denoms) {
        return cash.getOrDefault(denoms, 0);
    }

    @Override
    public String toString() {
        Printer printer = new Printer();

        if (!cash.isEmpty()) {
            printer.addLine();

            for (Denoms denoms : cash.keySet()) {
                int quantity = cash.get(denoms);

                printer
                        .addText(denoms.toString() + ":", 12)
                        .addText(quantity + " x", 6)
                        .addText("$" + denoms.getValue() + " =", 7)
                        .addText("$" + quantity * denoms.getValue(), 6)
                        .addLine();
            }

            printer.addLine("$" + amount + " withdrawn  ---------------");
        }

        return "WITHDRAWING $" + amount + ": " + message + printer;
    }
}
