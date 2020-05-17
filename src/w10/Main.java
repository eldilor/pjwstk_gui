package w10;

import w2.Student;

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        /*
        Student s0534 = new Student(534, "Student 1");
        Student s1234 = new Student(1234, "Student 2");
        Student s4321 = new Student(4321, "Student 3");

        Student[] students = {s0534, s1234, s4321};

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/w10/data.obj")
            );
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */

        SwingUtilities.invokeLater(
                () -> {
                    JFrame jf = new MyJFrame();

                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setVisible(true);
                    jf.setSize(new Dimension(500, 500));
                }
        );
    }
}
