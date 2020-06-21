package p4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    final static double WIDTH = 500;
    final static double HEIGHT = 500;
    private int currentPlotIndex = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        pane.setStyle("-fx-background-color: black;");

        Func[] plts = {
                new Func(
                        d -> Math.sin(d), "sin(x)",
                        0, 2 * Math.PI, -0.5, 0.9, WIDTH, HEIGHT),
                new Func(
                        d -> d * d * (d - 1), "x^2(x-1)",
                        -0.5, 1.5, -0.5, 0.5, WIDTH, HEIGHT),
                new Func(
                        d -> Math.cos(d) * Math.exp(-d), "cos(x)e^(-x)",
                        -2, 2, -2, 2, WIDTH, HEIGHT),
                new Func(
                        d -> Math.pow(Math.sin(d), 7), "sin(x)^7",
                        -1.5, 2, -0.5, 1, WIDTH, HEIGHT),
        };

        GridPane container = new GridPane();

        Label label = new Label("");
        Button button = new Button("Next");

        button.setOnMouseClicked(e -> {
            currentPlotIndex = currentPlotIndex == plts.length - 1 ? 0 : currentPlotIndex + 1;

            Func currentFunc = plts[currentPlotIndex];

            label.setText(currentFunc.getName());

            pane.getChildren().clear();
            pane.getChildren().add(new ChartPane(currentFunc));
        });

        Func currentFunc = plts[currentPlotIndex];

        label.setText(currentFunc.getName());
        pane.getChildren().add(new ChartPane(currentFunc));


        container.add(label, 1, 1);
        container.add(pane, 1, 2);
        container.add(button, 1, 3);

        Scene scene = new Scene(container);
        stage.setScene(scene);

        stage.setResizable(false);
        stage.show();
    }
}

