package w9;

import w2.Student;

import javax.swing.*;
import java.awt.*;

public class StudentRenderer extends JPanel implements ListCellRenderer {
    private JPanel dataPanel;
    private JLabel idString;
    private JLabel nameString;
    private JTextField idField;
    private JTextField nameField;

    public StudentRenderer() {
        System.out.println("Tworzę panel tylko raz!");

        dataPanel = new JPanel();
        idString = new JLabel("ID: ");
        nameString = new JLabel("Name: ");
        idField = new JTextField();
        nameField = new JTextField();

        dataPanel.setLayout(
                new GridLayout(2, 2)
        );
        dataPanel.add(idString);
        dataPanel.add(idField);
        dataPanel.add(nameString);
        dataPanel.add(nameField);

        add(dataPanel, BorderLayout.LINE_END);
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object o, int i, boolean b, boolean b1) {
        if (o == null) return null;
        Student student = (Student) o;
        nameField.setText(student.getName());
        idField.setText(student.getId() + "");

        return this;
    }
}
