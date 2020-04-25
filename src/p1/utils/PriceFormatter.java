package p1.utils;

public class PriceFormatter {
    public static String format(int price) {
        int zl = price / 100;
        int gr = price % 100;

        return zl + "," + DigitFormatter.format(gr) + " zł";
    }
}
