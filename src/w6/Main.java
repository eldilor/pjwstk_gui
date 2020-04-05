package w6;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> 2 * n + 1)
//                .forEach(System.out::print)
                .average()
                .ifPresent(System.out::println);


        // ==============================
        Stream.of("d2", "a2", "b1", "c")
                .map(s -> {
                    System.out.println("map: " + s);

                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);

                    return s.startsWith("A");
                })
                .forEach(System.out::println);

        System.out.println("==== NEXT ====");

        Stream.of("d2", "a2", "b1", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);

                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);

                    return s.toUpperCase();
                })
                .forEach(System.out::println);

        System.out.println("==== NEXT ====");

        Stream<String> stream = Stream.of("d2", "a2", "b1", "c")
                .filter(s -> s.startsWith("a"));

//        stream.anyMatch(s -> true);
//        stream.noneMatch(s -> true);

        System.out.println("==== NEXT ====");

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "c")
                .filter(s -> s.startsWith("a"));

        streamSupplier.get().anyMatch(s -> true);
        streamSupplier.get().noneMatch(s -> true);
    }
}
