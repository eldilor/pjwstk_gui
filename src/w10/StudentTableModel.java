package w10;

import w2.Student;

import javax.swing.table.AbstractTableModel;
import java.io.*;

public class StudentTableModel extends AbstractTableModel {
    Student students[];

    public StudentTableModel() {
        students = readFromFile();
    }

    private Student[] readFromFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/w10/data.obj"));

            return (Student[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    private void saveToFile() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/w10/data.obj")
            );
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public int getRowCount() {
        return students.length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Student student = students[row];

        switch (column) {
            case 0:
                return student.getId();
            case 1:
                return student.getName();
            case 2:
                return student.isGraduate();
            case 3:
                return student.getStatus();
        }

        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 2:
                return Boolean.class;
            default:
                return super.getColumnClass(columnIndex);
        }
    }
}
