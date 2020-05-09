package p2;

public enum Denoms {
    HUNDRED(100),
    FIFTY(50),
    TWENTY(20),
    TEN(10),
    FIVE(5),
    TWO(2),
    ONE(1);

    private int value;

    Denoms(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
