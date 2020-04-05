package c6.z6;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "src/c6/z6/in.txt";
        ArrayList<Person> peopleList = getPeopleArrayListFromFile(inputFilePath);

        System.out.println("All cars: ");
        System.out.println(findAllCars(peopleList));

        System.out.println("Owners of Skoda: ");
        System.out.println(findOwners(peopleList, "Skoda"));

        System.out.println("John's (1980) car color: ");
        System.out.println(findColor(peopleList, "John", 1980));
    }

    public static List<Car> findAllCars(List<Person> list) {
        List<Car> carList = new ArrayList<>();

        for (Person person : list) {
            if (person.getCar() != null) {
                carList.add(person.getCar());
            }
        }

        return carList;
    }

    public static List<Person> findOwners(List<Person> list, String carName) {
        List<Person> owners = new ArrayList<>();

        for (Person person : list) {
            if (person.getCar() != null && person.getCar().getName().equals(carName)) {
                owners.add(person);
            }
        }

        return owners;
    }

    public static Color findColor(List<Person> list, String name, int year) {
        for (Person person : list) {
            if (person.equals(name, year) && person.getCar() != null) {
                return person.getCar().getColor();
            }
        }

        return null;
    }

    private static ArrayList<Person> getPeopleArrayListFromFile(String filePathName) {
        Scanner scanner = null;
        ArrayList<Person> peopleList = new ArrayList<>();

        try {
            scanner = new Scanner(new File(filePathName));

            while (scanner.hasNext()) {
                peopleList.add(getPersonFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return peopleList;
    }

    private static Person getPersonFromLine(String line) {
        String colorDigitRegex = "(0|(1[0-9]?[0-9]?)|(2[0-4]?[0-9]?)|(25[0-5]))";
        Pattern pattern = Pattern.compile("((\\w+) (\\d{4}))( (\\w+) " + colorDigitRegex + " " + colorDigitRegex + " " + colorDigitRegex + ")?");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            String name = matcher.group(2);
            int birthYear = Integer.parseInt(matcher.group(3));
            Car car = null;

            String maybeCarName = matcher.group(5);
            String maybeR = matcher.group(6);
            String maybeG = matcher.group(10);
            String maybeB = matcher.group(14);

            if (maybeCarName != null && maybeR != null && maybeG != null && maybeB != null) {
                car = new Car(maybeCarName, new Color(
                        Integer.parseInt(maybeR),
                        Integer.parseInt(maybeG),
                        Integer.parseInt(maybeB)
                ));
            }

            return new Person(name, birthYear, car);
        }

        return null;
    }
}
