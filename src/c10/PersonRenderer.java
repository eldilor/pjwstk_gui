package c10;

import javax.swing.*;
import java.awt.*;

public class PersonRenderer extends JPanel implements ListCellRenderer<Person> {
    private JLabel label;

    public PersonRenderer() {
        this.label = new JLabel();
        this.label.setBackground(Color.BLUE);

        add(this.label);
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Person person, int i, boolean b, boolean b1) {
        label.setText(person.toString());

        this.setBackground(Color.WHITE);

        if (person.getSize() == Size.XS) this.setBackground(Color.GREEN);
        if (person.getSize() == Size.XL) this.setBackground(Color.RED);

        return this;
    }
}
