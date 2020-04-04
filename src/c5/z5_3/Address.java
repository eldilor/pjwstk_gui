package c5.z5_3;

public class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number + " " + this.street;
    }

    public String getStreet() {
        return street;
    }
}
