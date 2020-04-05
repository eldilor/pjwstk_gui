package c6.z6;

import java.awt.*;

public class Car {
    private String name;
    private Color color;

    public Car(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + " rgb(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")";
    }
}
