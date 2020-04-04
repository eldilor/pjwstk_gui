package c5.z5_3;

public class Main {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("John", new Address("Oxford St", 12)),
                new Person("Mary", new Address("Main St", 35)),
                new Person("Alice", new Address("Main St", 11)),
                new Person("Cindy", new Address("Gloucester St", 1))
        };
        System.out.println(Person.atAddress(arr, "Main St"));
    }
}