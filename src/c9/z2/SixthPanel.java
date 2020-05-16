package c9.z2;

import javax.swing.*;
import java.awt.*;

public class SixthPanel extends JPanel {
    public SixthPanel() {
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 4));

        for (int i = 1; i <= 4; i++) northPanel.add(new JButton(i + ""));;

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2));

        JPanel textFieldsPanel = new JPanel();
        textFieldsPanel.setLayout(new GridLayout(3, 1));

        for (int i = 1; i <= 3; i++) textFieldsPanel.add(new JTextField(i + ""));

        centerPanel.add(new JTextArea("JTextArea 1"));
        centerPanel.add(textFieldsPanel);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, 4));

        for (int i = 5; i <= 8; i++) southPanel.add(new JButton(i + ""));;

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
}
