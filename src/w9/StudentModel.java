package w9;

import w2.Student;

import javax.swing.*;

public class StudentModel extends DefaultComboBoxModel {
    private Student s0534 = new Student(534, "Student 1");
    private Student s1234 = new Student(1234, "Student 2");
    private Student s4321 = new Student(4321, "Student 3");

    private Student[] tab = {s0534, s1234, s4321};

    @Override
    public int getSize() {
        return tab.length;
    }

    @Override
    public Object getElementAt(int i) {
        return tab[i];
    }
}
