package p3;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    private ArrayList<Person> people;

    public PersonTableModel() {
        this.people = FileReader.read("src/p3/in.txt");
    }

    @Override
    public int getRowCount() {
        return people.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Person person = people.get(row);

        switch (column) {
            case 0:
                return person.getName();
            case 1:
                return person.getLastName();
            case 2:
                return person.getBirth();
            case 3:
                return person.getColor();
            case 4:
                return person.getHeight();
            case 5:
                return person.getWeight();
            case 6:
                return person.getBmi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Name";
            case 1:
                return "Last name";
            case 2:
                return "Birth day";
            case 3:
                return "Fav. color";
            case 4:
                return "Height [cm]";
            case 5:
                return "Weight [cm]";
            case 6:
                return "BMI";
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int column) {
        switch (column) {
            case 2:
                return LocalDate.class;
            case 3:
                return Color.class;
            case 4:
            case 5:
            case 6:
                return Integer.class;
            default:
                return super.getColumnClass(column);
        }
    }
}
