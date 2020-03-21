package c3.z1;

public class Main {
    public static void main(String[] args) {
        Parabola parabola = new Parabola(1, -1, 1.25);

        double res = FunDD.xminim(parabola, 0, 1);
        System.out.println(res);

        res = FunDD.xminim(new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(new Parabola(1, -1.5, 1.5625).fun(x));
            }
        }, 0, 2);
        System.out.println(res);

        res = FunDD.xminim(x -> Math.pow(x, 3) - 2 * x * x, 0, 2);
        System.out.println(res);
    }
}
