package c10;

public class Person {
    private int height;
    private int weight;
    private String name;
    private Size size;

    public Person(int height, int weight, String name, Size size) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return this.name + " (h=" + this.height + ", w=" + this.weight + ", size=" + this.size + ")";
    }

    public Size getSize() {
        return size;
    }
}
