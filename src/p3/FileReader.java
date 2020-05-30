package p3;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {
    public static ArrayList<Person> read(String fileName) {
        ArrayList<Person> people = new ArrayList<>();

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            for (String line : lines.collect(Collectors.toList())) {
                String[] cells = line.split("[ ]+");
                String[] rgb = cells[3].split(",");

                if (cells.length != 6 || rgb.length != 3) throw new Exception("File is corrupted!");

                people.add(
                        new Person(
                                cells[0],
                                cells[1],
                                LocalDate.parse(cells[2], DateTimeFormatter.ofPattern("yyyy-M-d")),
                                new Color(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]), Integer.parseInt(rgb[2])),
                                Integer.parseInt(cells[4]),
                                Integer.parseInt(cells[5])
                        )
                );
            }
        } catch (Exception e) {
            System.out.println("Something wrong...");
            e.printStackTrace();
            System.exit(1);
        }

        return people;
    }
}
