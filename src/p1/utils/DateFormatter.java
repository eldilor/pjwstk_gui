package p1.utils;

import java.util.Date;

public class DateFormatter {
    public static String format(Date date) {
        String d = DigitFormatter.format(date.getDate());
        String M = DigitFormatter.format(date.getMonth() + 1);
        String h = DigitFormatter.format(date.getHours());
        String m = DigitFormatter.format(date.getMinutes());
        String s = DigitFormatter.format(date.getSeconds());

        return d + "/" + M + "/" + (date.getYear() + 1900) + " " + h + ":" + m + ":" + s;
    }
}
