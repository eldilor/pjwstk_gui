package c9.z1;

import javax.swing.*;
import java.awt.*;

public class SnowmanJPanel extends JPanel {
    public SnowmanJPanel() {
        setBackground(Color.BLUE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelHeight = getHeight();
        int panelWidth = getWidth();

        SnowBall head = new SnowBall(panelHeight / 12);
        SnowBall body = new SnowBall(panelHeight / 6);
        SnowBall feet = new SnowBall(panelHeight / 4);

        g.setColor(Color.WHITE);
        g.fillOval(panelWidth / 2 - head.getRadius(), 0, head.getDiameter(), head.getDiameter());
        g.fillOval(panelWidth / 2 - body.getRadius(), head.getDiameter(), body.getDiameter(), body.getDiameter());
        g.fillOval(panelWidth / 2 - feet.getRadius(), body.getDiameter() + head.getDiameter(), feet.getDiameter(), feet.getDiameter());
    }
}
