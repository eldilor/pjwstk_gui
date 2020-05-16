package w9;

import javax.swing.*;
import java.awt.*;

public class MyImageJPanel extends JPanel {
    public MyImageJPanel() {
        setPreferredSize(new Dimension(5000, 5000));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                Color c = new Color(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)
                );

                g.setColor(c);
                g.fillRect(i * 20, j * 20, 20, 20);
            }
        }
    }
}
