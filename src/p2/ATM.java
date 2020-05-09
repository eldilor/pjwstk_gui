package p2;


import java.util.LinkedHashMap;

public class ATM {
    private LinkedHashMap<Denoms, Integer> cash = new LinkedHashMap<>();

    public ATM() {
        for (Denoms denoms : Denoms.values()) {
            cash.put(denoms, 0);
        }
    }

    public ATM add(Denoms denoms, int quantity) {
        cash.put(denoms, cash.get(denoms) + quantity);

        return this;
    }

    public Confirmation withdraw(int amount) {
        return null;
    }

    @Override
    public String toString() {
        Printer printer = new Printer();
        int total = 0;

        printer.addLine("***** Current state of this ATM");

        for (Denoms denoms : cash.keySet()) {
            int quantity = cash.get(denoms);
            total += quantity * denoms.getValue();

            printer
                    .addText(denoms.toString() + ":", 12)
                    .addText(quantity + " x", 6)
                    .addText("$" + denoms.getValue() + " =", 7)
                    .addText("$" + quantity * denoms.getValue(), 6)
                    .addLine();
        }

        printer
                .addText("***** TOTAL: ************")
                .addText(" $" + total, 6)
                .addLine();

        return printer.toString();
    }
}
