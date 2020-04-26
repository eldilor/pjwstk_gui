package w8;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JPanel {
    public MyBorderLayout() {
        setLayout(new BorderLayout());
        // Since Java 8 shouldn't be like this:
//        add(new Button("North"), BorderLayout.NORTH);
//        add(new Button("South"), BorderLayout.SOUTH);
//        add(new Button("East"), BorderLayout.EAST);
//        add(new Button("West"), BorderLayout.WEST);
//        add(new Button("Center"), BorderLayout.CENTER);
        // After Java 8 should be like this:
        add(new Button("Page start"), BorderLayout.PAGE_START);
        add(new Button("Page end"), BorderLayout.PAGE_END);
        add(new Button("Line end"), BorderLayout.LINE_END);
        add(new Button("Line start"), BorderLayout.LINE_START);
        add(new Button("Center"), BorderLayout.CENTER);
    }
}
