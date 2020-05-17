package w2;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
    int id;
    String name;

    boolean graduate;
    int status;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.graduate = false;
        this.status = 0;
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

    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
