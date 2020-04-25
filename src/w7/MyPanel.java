package w7;

import java.awt.*;

public class MyPanel extends Panel {
    private Color color;

    public MyPanel(Color color) {
        this.setPreferredSize(new Dimension(100, 100));
        this.color = color;
        this.setBackground();
    }

    public Color generateColor() {
        this.color = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
        this.setBackground();

        return this.color;
    }

    public void setBackground() {
        this.setBackground(this.color);
        this.repaint();
    }

    public void setColor(Color color) {
        this.color = color;
        this.setBackground();
    }
}
