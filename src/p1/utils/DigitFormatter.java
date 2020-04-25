package p1.utils;

public class DigitFormatter {
    public static String format(int digit) {
        return digit > 9 ? String.valueOf(digit) : "0" + digit;
    }
}
