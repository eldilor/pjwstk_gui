package c4.z1;

public class LenFilter implements SFilter {
    private int minLen;

    public LenFilter(int minLen) {
        this.minLen = minLen;
    }

    @Override
    public boolean test(String str) {
        return str.length() >= this.minLen;
    }
}
