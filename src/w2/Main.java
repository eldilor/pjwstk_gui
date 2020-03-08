package w2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        MyList<String> list = new MyList<>();

        list.add("Ala");
        list.add("ma");
        list.add("kota");

        list.show();

        MyList<Student> studentList = new MyList<>();
        Student s1 = new Student(534, "Student");

        studentList.add(s1);

        studentList.show();
        */

        Student s0534 = new Student(534, "Student");
        Student s0534a = new Student(534, "Ala");
        Student s1234 = new Student(1234, "Uczen");

        Student[] students = { s1234, s0534, s0534a };

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
