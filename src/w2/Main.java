package w2;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Ala");
        list.add("ma");
        list.add("kota");

        list.show();

        MyList<Student> studentList = new MyList<>();
        Student s1 = new Student(534, "Student");

        studentList.add(s1);

        studentList.show();
    }
}
