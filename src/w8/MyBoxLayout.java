package w8;

import javax.swing.*;

public class MyBoxLayout extends JPanel {
    public MyBoxLayout() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        for (int i = 0; i < 10; i++) {
            add(new JButton("Button " + i));
        }
    }
}
