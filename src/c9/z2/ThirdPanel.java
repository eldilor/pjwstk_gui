package c9.z2;

import javax.swing.*;
import java.awt.*;

public class ThirdPanel extends JPanel {
    public ThirdPanel() {
        setLayout(new GridLayout(2, 1));

        JPanel leftButtonsPanel = new JPanel();
        leftButtonsPanel.setLayout(new GridLayout(2, 2));

        for (int i = 1; i <= 4; i++) leftButtonsPanel.add(new JButton(i + ""));

        JPanel rightButtonsPanel = new JPanel();
        rightButtonsPanel.setLayout(new GridLayout(2, 2));

        for (int i = 5; i <= 8; i++) rightButtonsPanel.add(new JButton(i + ""));

        JPanel textFieldsPanel = new JPanel();
        textFieldsPanel.setLayout(new GridLayout(3, 1));

        for (int i = 1; i <= 3; i++) textFieldsPanel.add(new JTextField(i + ""));

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());

        southPanel.add(leftButtonsPanel, BorderLayout.WEST);
        southPanel.add(textFieldsPanel, BorderLayout.CENTER);
        southPanel.add(rightButtonsPanel, BorderLayout.EAST);

        add(new JTextArea("JTextArea 1"));
        add(southPanel);
    }
}
