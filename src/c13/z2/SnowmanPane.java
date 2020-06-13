package c13.z2;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class SnowmanPane extends Pane {
    public SnowmanPane() {
        super();

        setStyle("-fx-background-color: #0000ff");


        Circle head = new Circle(getWidth() / 12, Color.WHITE);

        head.centerXProperty().bind(widthProperty().divide(2));
        head.centerYProperty().bind(heightProperty().subtract(heightProperty().multiply(11. / 12.)));
        head.radiusProperty().bind(heightProperty().divide(12));

        Circle body = new Circle(getWidth() / 6, Color.WHITE);

        body.centerXProperty().bind(widthProperty().divide(2));
        body.centerYProperty().bind(heightProperty().subtract(heightProperty().multiply(8. / 12.)));
        body.radiusProperty().bind(heightProperty().divide(6));

        Circle feet = new Circle(getWidth() / 4, Color.WHITE);

        feet.centerXProperty().bind(widthProperty().divide(2));
        feet.centerYProperty().bind(heightProperty().subtract(heightProperty().multiply(3. / 12.)));
        feet.radiusProperty().bind(heightProperty().divide(4));

        getChildren().add(head);
        getChildren().add(body);
        getChildren().add(feet);
    }
}
