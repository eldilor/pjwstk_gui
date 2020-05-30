package p3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = FileReader.read("src/p3/in.txt");
        System.out.println(people);
    }
}
