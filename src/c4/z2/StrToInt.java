package c4.z2;

public class StrToInt implements Transform<String, Integer> {
    @Override
    public Integer apply(String str) {
        return str.length();
    }
}
