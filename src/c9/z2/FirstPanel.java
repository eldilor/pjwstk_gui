package c9.z2;

import javax.swing.*;
import java.awt.*;

public class FirstPanel extends JPanel {
    public FirstPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.YELLOW);

        JPanel northPanel = new JPanel();

        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.PAGE_AXIS));

        northPanel.add(new JTextField("TextField 1"));
        northPanel.add(new JTextField("TextField 2"));
        northPanel.add(new JTextField("TextField 3"));

        northPanel.setBackground(Color.GREEN);

        JPanel southPanel = new JPanel();

        southPanel.setLayout(new BorderLayout());

        southPanel.add(new JTextArea("TextArea 1"), BorderLayout.WEST);

        JPanel southEastPanel = new JPanel();

        southEastPanel.setLayout(new GridLayout(3, 3));

        southEastPanel.add(new JButton("B01"));
        southEastPanel.add(new JButton("B02"));
        southEastPanel.add(new JButton("B03"));
        southEastPanel.add(new JButton("B04"));
        southEastPanel.add(new JButton("B05"));
        southEastPanel.add(new JButton("B06"));
        southEastPanel.add(new JButton("B07"));
        southEastPanel.add(new JButton("B08"));
        southEastPanel.add(new JButton("B09"));


        southPanel.add(southEastPanel, BorderLayout.CENTER);

        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.CENTER);
    }
}
