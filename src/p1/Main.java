package p1;

import p1.store.Action;
import p1.store.State;
import p1.store.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        State state = Store.createStore();

        while (!state.isEnd()) {
            try {
                System.out.print(state.getCurrentNode().getName());
                System.out.println(state.getCurrentCustomer() != null ? " (zalogowany jako " + state.getCurrentCustomer().getName() + ")" : "");
                System.out.println(getOptions(state.getPossibleActions()));

                int chosenOption = scanner.nextInt();
                System.out.println(chosenOption);
                Action action = state.getPossibleActions().get(chosenOption);

                Store.dispatch(action);
                System.out.println("\n================\n");
            } catch (Exception ex) {
                scanner = new Scanner(System.in);
                System.out.println("[ERROR] Invalid argument!");
            }
        }

        System.out.println("Dziękujemy za zakupy :)");

        scanner.close();
    }

    private static String getOptions(ArrayList<Action> possibleActions) {
        String options = "";

        for (int i = 0; i < possibleActions.size(); i++) {
            options += "  [" + i + "] " + possibleActions.get(i).getTo().getName() + "\n";
        }

        return options;
    }
}
