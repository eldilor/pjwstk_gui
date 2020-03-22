package c4.z1;

import java.util.ArrayList;

@FunctionalInterface
public interface SFilter {
    public static String[] filter(String[] arr, SFilter filt) {
        ArrayList<String> list = new ArrayList<>();

        for (String string : arr) {
            if (filt.test(string)) {
                list.add(string);
            }
        }

        return list.toArray(new String[0]);
    }

    boolean test(String str);
}
