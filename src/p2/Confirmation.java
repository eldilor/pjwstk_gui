package p2;

public class Confirmation {
    private int amount;
    private String message;

    public Confirmation(int amount, String message) {
        this.amount = amount;
        this.message = message;
    }

    public int getNumOfBills(Denoms denoms) {
        return 0;
    }

    @Override
    public String toString() {
        return "WITHDRAWING $" + amount + ": " + message;
    }
}
