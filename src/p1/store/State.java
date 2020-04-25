package p1.store;

import java.util.ArrayList;

public class State {
    String message;
    boolean isEnd;
    ArrayList<Action> possibleActions;

    public String getMessage() {
        return message;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public ArrayList<Action> getPossibleActions() {
        return possibleActions;
    }
}
