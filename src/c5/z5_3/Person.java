package c5.z5_3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Address addr;

    public Person(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public static List<Person> atAddress(Person[] arr, String street) {
        List<Person> list = new ArrayList<>();

        for (Person person : arr) {
            if (person.livesAtStreet(street)) {
                list.add(person);
            }
        }

        return list;
    }

    private boolean livesAtStreet(String street) {
        return this.addr.getStreet().equals(street);
    }

    @Override
    public String toString() {
        return this.name + "(" + this.addr + ")";
    }
}
