package w8;

import javax.swing.*;
import java.awt.*;

public class MyPaintComponent extends JComponent {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.drawString("Hello !", 75, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(120, 120, 100, 100);
        g.setColor(Color.ORANGE);
        g.drawOval(120, 120, 100, 100);
    }
}
