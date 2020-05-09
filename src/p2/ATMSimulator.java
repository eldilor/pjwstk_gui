package p2;

public class ATMSimulator {
    public static void main (String[] args) {
        ATM atm = new ATM()
                .add(Denoms.HUNDRED, 5)
                .add(Denoms.FIFTY,   3)
                .add(Denoms.TWENTY,  3)
                .add(Denoms.TEN,     2)
                .add(Denoms.FIVE,    1)
                .add(Denoms.TWO,     2)
                .add(Denoms.ONE,     2);

        System.out.println("Initial state of ATM\n" + atm);

        Confirmation cnf = atm.withdraw(666);
        System.out.println(cnf);
        System.out.println("We've got " +
                cnf.getNumOfBills(Denoms.FIFTY) +
                " $50 dollar bills\n");

        cnf = atm.withdraw(500);
        System.out.println(cnf);

        cnf = atm.withdraw(-20);
        System.out.println(cnf);

        cnf = atm.withdraw(49);
        System.out.println(cnf);

        cnf = atm.withdraw(55);
        System.out.println(cnf);

        System.out.println("Final state of ATM\n" + atm);
    }
}