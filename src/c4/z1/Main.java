package c4.z1;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));

        LenFilter lenFilter = new LenFilter(4);

        String[] a1 = SFilter.filter(arr, lenFilter);
        System.out.println(Arrays.toString(a1));

        String[] a2 = SFilter.filter(arr, new SFilter() {
            @Override
            public boolean test(String str) {
                return str.charAt(0) >= 'A' && str.charAt(0) < 'D';
            }
        });
        System.out.println(Arrays.toString(a2));

        String[] a3 = SFilter.filter(
                arr,
                (String str) -> str.charAt(0) > 'H' && str.charAt(0) <= 'Z'
        );
        System.out.println(Arrays.toString(a3));
    }
}