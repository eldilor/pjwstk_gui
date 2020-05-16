package c9.z2;

import javax.swing.*;
import java.awt.*;

public class SecondPanel extends JPanel {
    public SecondPanel() {
        setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();

        buttonsPanel.setLayout(new GridLayout(3, 4));

        for (int i = 1; i <= 12; i++) buttonsPanel.add(new JButton(i + ""));

        add(new JTextArea("JTextArea 1"), BorderLayout.WEST);
        add(new JTextArea("JTextArea 2"), BorderLayout.EAST);
        add(new JTextField("JTextField 4"), BorderLayout.SOUTH);
        add(buttonsPanel, BorderLayout.CENTER);
    }
}
