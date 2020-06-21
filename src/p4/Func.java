package p4;

public class Func {
    private IFunc func;
    private String name;
    private double xMin;
    private double xMax;
    private double yMin;
    private double yMax;
    private double width;
    private double height;
    private double xRatio;
    private double yRatio;


    public Func(IFunc func, String name, double xMin, double xMax, double yMin, double yMax, double width, double height) {
        this.func = func;
        this.name = name;
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
        this.width = width;
        this.height = height;

        this.xRatio = width / (xMax - xMin);
        this.yRatio = height / (yMax - yMin);
    }

    public String getName() {
        return name;
    }

    public double getXMin() {
        return xMin;
    }

    public double getXMax() {
        return xMax;
    }

    public double getYMin() {
        return yMin;
    }

    public double getYMax() {
        return yMax;
    }

    public double getPixelX(double x) {
        return (x - xMin) * xRatio;
    }

    public double getPixelY(double y) {
        return height - ((y - yMin) * yRatio);
    }

    public double getY(double x) {
        return func.fun(x);
    }
}
