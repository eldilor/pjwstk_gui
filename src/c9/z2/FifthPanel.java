package c9.z2;

import javax.swing.*;
import java.awt.*;

public class FifthPanel extends JPanel {
    public FifthPanel() {
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3, 1));

        northPanel.add(new JTextField("JTextField 1"));
        northPanel.add(new JTextField("JTextField 2"));
        northPanel.add(new JTextField("JTextField 3"));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2));

        centerPanel.add(new JTextArea("JTextArea 1"));
        centerPanel.add(new JTextArea("JTextArea 2"));

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, 5));

        for (int i = 1; i <= 5; i++) southPanel.add(new JButton(i + ""));

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
    }
}
