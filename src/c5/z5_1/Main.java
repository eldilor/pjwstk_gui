package c5.z5_1;

import java.util.Arrays;
import java.util.Comparator;


public class Main {

    private static <T> void printArray(String description, T[] array) {
        System.out.println("  *** " + description + " ***");

        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL, Country.NL),
                new Person("Jan", Sex.M, Size.S, Country.PL),
                new Person("Eva", Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L, Country.DE),
                new Person("Mila", Sex.F, Size.S, Country.DE),
                new Person("Ola", Sex.F, Size.M, Country.PL),
        };

        Comparator<Person> sexThenSize = (p1, p2) -> {
            if (p1.getSex() == p2.getSex()) {
                return p1.getSize().ordinal() - p2.getSize().ordinal();
            }

            return p1.getSex().ordinal() - p2.getSex().ordinal();
        };
        Arrays.sort(persons, sexThenSize);
        printArray("Persons by sex and then size", persons);

        Arrays.sort(persons, (p1, p2) -> {
            if (p1.getSize() == p2.getSize()) {
                return p1.getName().compareTo(p2.getName());
            }

            return p1.getSize().ordinal() - p2.getSize().ordinal();
        });
        printArray("Persons by size and then name", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, (c1, c2) -> c1.toString().compareTo(c2.toString()));
        printArray("Countries by name", countries);
    }
}