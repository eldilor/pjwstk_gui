package w2;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.id == o.id) {
            return this.name.compareTo(o.name);
        }

        if (this.id < o.id) return -1;

        return 1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
