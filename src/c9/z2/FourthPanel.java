package c9.z2;

import javax.swing.*;
import java.awt.*;

public class FourthPanel extends JPanel {
    public FourthPanel() {
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(2, 5));

        for (int i = 1; i <= 10; i++) buttonsPanel.add(new JButton(i + ""));

        JPanel textFieldsPanel = new JPanel();
        textFieldsPanel.setLayout(new GridLayout(3, 1));

        textFieldsPanel.add(new JTextField("JTextField 1"));
        textFieldsPanel.add(new JTextField("JTextField 2"));
        textFieldsPanel.add(new JTextField("JTextField 3"));

        centerPanel.add(buttonsPanel, BorderLayout.NORTH);
        centerPanel.add(textFieldsPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        southPanel.add(new Button("B11"));
        southPanel.add(new Button("B12"));
        southPanel.add(new Button("B13"));

        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
}
