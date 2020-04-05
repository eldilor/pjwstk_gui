package c6.z6;

public class Person {
    private String name;
    private int yearOfBirth;
    private Car car;

    public Person(String name, int yearOfBirth, Car car) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean equals(String name, int yearOfBirth) {
        return name.equals(this.name) && yearOfBirth == this.yearOfBirth;
    }
}
