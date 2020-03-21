package c3.z1;

@FunctionalInterface
public interface FunDD {
    double fun(double x);

    static double xminim(FunDD f, double a, double b) {
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }

        double step = 1e-5, min = f.fun(a);

        for (double i = a; i <= b; i += step) {
            double value = f.fun(i);

            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}