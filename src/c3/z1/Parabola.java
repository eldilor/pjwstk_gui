package c3.z1;

public class Parabola implements FunDD {
    private double a;
    private double b;
    private double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double fun(double x) {
        return this.a * x * x + this.b * x + this.c;
    }
}
