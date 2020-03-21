package c3.z2;

import java.awt.*;

public class MyColor extends Color implements Comparable<MyColor> {
    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    public int getColorSum() {
        return this.getRed() + this.getGreen() + this.getBlue();
    }

    @Override
    public int compareTo(MyColor color) {
        return this.getColorSum() - color.getColorSum();
    }

    @Override
    public String toString() {
        return "(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ")";
    }
}
