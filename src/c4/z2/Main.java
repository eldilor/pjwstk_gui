package c4.z2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[]  sin = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(sin) + '\n');

        StrToInt strToInt = new StrToInt();

        Integer[] iout = new Integer[sin.length];
        transform(sin, iout, strToInt);
        System.out.println(Arrays.toString(iout));

        Character[] cout = new Character[sin.length];
        transform(sin, cout, new Transform<String, Character>() {
            @Override
            public Character apply(String element) {
                return element.charAt(0);
            }
        });
        System.out.println(Arrays.toString(cout));

        String[] sout = new String[sin.length];
        transform(sin, sout, (String str) -> str.toUpperCase());
        System.out.println(Arrays.toString(sout));
    }

    private static<T,R> void transform(T[] in, R[] out, Transform<T, R> trans) {
        for (int i = 0; i < in.length; i++) {
            out[i] = trans.apply(in[i]);
        }
    }
}
