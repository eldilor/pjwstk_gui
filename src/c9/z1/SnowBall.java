package c9.z1;

public class SnowBall {
    private int radius;

    public SnowBall(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return radius * 2;
    }
}
