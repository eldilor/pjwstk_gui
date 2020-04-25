package w7;

import java.awt.*;
import java.util.ArrayList;

public class GeneratorPanel extends MyPanel implements Runnable {

    ArrayList<ColorListener> a1 = new ArrayList<>();

    public GeneratorPanel(Color color) {
        super(color);

        new Thread(this).start();
    }

    public void run() {
        do {
            Color localColor = this.generateColor();
            this.setBackground();

            fireColorChange(new ColorEvent(this, localColor));

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!Thread.currentThread().isInterrupted());
    }

    public void addColorListener(ColorListener colorListener) {
        a1.add(colorListener);
    }

    public void fireColorChange(ColorEvent evt) {
        for (ColorListener colorListener : a1) {
            colorListener.colorChanged(evt);
        }
    }
}
