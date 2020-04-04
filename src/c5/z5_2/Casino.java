package c5.z5_2;

import java.util.Iterator;

public class Casino implements Iterable<Integer>, Iterator<Integer> {
    private int history = 0b1000;

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        int lastThree = this.history & 0b111;
        return this.history <= 0b100000 || (lastThree != 0b111 && lastThree != 0b000);
    }

    @Override
    public Integer next() {
        int value = Math.random() > 0.5 ? 1 : 0;

        this.history <<= 1;
        this.history |= value;

        return value;
    }
}
