package w8;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JPanel {
    public MyFlowLayout() {
        setLayout(new FlowLayout());

        for (int i = 0; i < 10; i++) {
            add(new JButton("Button " + i));
        }
    }
}
