package w2;

public class Element<T extends Comparable<T>> implements Comparable<T> {
    T data;
    Element next;

    @Override
    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}
