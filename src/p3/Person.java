package p3;

import java.awt.*;
import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private LocalDate birth;
    private Color color;
    private int height;
    private int weight;
    private int bmi;

    public Person(String name, String lastName, LocalDate birth, Color color, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.bmi = (int) Math.round(weight / (height * height / 10000.0));
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBmi() {
        return bmi;
    }
}
