package w7;

import java.awt.*;

public class ResponsePanel extends MyPanel implements ColorListener {
    public ResponsePanel(Color color) {
        super(color);

    }

    @Override
    public void colorChanged(ColorEvent evt) {
        this.setColor(evt.getColor());
    }
}
