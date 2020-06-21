package p4;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ChartPane extends Pane {
    private final double step = 0.001;
    private final double lineWidth = 1;
    private final Color color = Color.ORANGE;

    public ChartPane(Func func) {
        for (double x = func.getXMin(); x < func.getXMax(); x += step) {
            double y = func.getY(x);

            if (y < func.getYMin() || y > func.getYMax()) continue;

            getChildren().add(new Circle(func.getPixelX(x), func.getPixelY(y), lineWidth, color));
        }
    }
}
