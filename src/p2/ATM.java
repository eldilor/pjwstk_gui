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
        if (amount < 0) return new Confirmation(amount, "Negative amount requested; cancelled");
        if (amount == 0) return new Confirmation(amount, "Zero amount requested; cancelled");

        int total = 0, tmpAmount = amount;
        LinkedHashMap<Denoms, Integer> tmpCash = new LinkedHashMap<>(cash);
        LinkedHashMap<Denoms, Integer> withdrawnCash = new LinkedHashMap<>();

        for (Denoms denoms : cash.keySet()) {
            int quantity = cash.get(denoms);
            int maxAmountNeeded = tmpAmount / denoms.getValue();
            int withdrawnQuantity = Math.min(quantity, maxAmountNeeded);

            total += quantity * denoms.getValue();

            if (withdrawnQuantity > 0) withdrawnCash.put(denoms, withdrawnQuantity);

            tmpCash.put(denoms, tmpCash.get(denoms) - withdrawnQuantity);
            tmpAmount -= withdrawnQuantity * denoms.getValue();

            if (tmpAmount == 0) break;
        }

        if (total < amount) return new Confirmation(amount, "Non sufficient funds; cancelled");
        if (tmpAmount != 0) return new Confirmation(amount, "Lacking some needed bills; cancelled");

        cash = new LinkedHashMap<>(tmpCash);

        return new Confirmation(amount, "OK", withdrawnCash);
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
