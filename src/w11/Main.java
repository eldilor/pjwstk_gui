package w11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Initialized");
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Start");
//        Platform.exit(); // use this to close application

//        StackPane root = new StackPane();

//        Rectangle rectangle = new Rectangle(70, 70, Color.GREEN);
//        CheckBox checkBox = new CheckBox("Label");
//
//        root.getChildren().addAll(rectangle, checkBox);

//        HBox root = new HBox(5);
//        VBox root = new VBox(5);
//        StackPane root = new StackPane();
//
//        Rectangle rectangle1 = new Rectangle(50, 50,Color.GREEN);
//        Rectangle rectangle2 = new Rectangle(70, 70,Color.BLUE);
//        Rectangle rectangle3 = new Rectangle(90, 90,Color.RED);
//
//        root.getChildren().addAll(rectangle1, rectangle2, rectangle3);
//
//        rectangle3.toBack();
//        rectangle1.toFront();

//        TilePane root = new TilePane(5, 5);
//        root.setPrefColumns(4);
//        root.setPrefRows(4);

//        FlowPane root = new FlowPane(5, 5);
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                double size = 5 + 30 * Math.random();
//                Rectangle rectangle = new Rectangle(size, size, (i + j) % 2 == 0 ? Color.RED : Color.BLUE);
//
//                root.getChildren().add(rectangle);
//            }
//        }

//        BorderPane root = new BorderPane();
//
//        Text textTop = new Text("Top");
//
//        root.setTop(textTop);
//        root.setCenter(new Text("Center"));
//        root.setRight(new Text("Right"));
//        root.setBottom(new Text("Bottom"));
//        root.setLeft(new Text("Left"));
//
//        root.setAlignment(textTop, Pos.CENTER);

//        Rectangle rectangle = new Rectangle(50, 50, Color.BLUE);
//
//        Pane root = new AnchorPane(rectangle);
//        AnchorPane.setRightAnchor(rectangle, 20.);
//        AnchorPane.setBottomAnchor(rectangle, 20.);

        GridPane root = new GridPane();
        for (int i = 0; i < 5; i++) {
            root.getRowConstraints().add(
                    new RowConstraints(50)
            );
            root.getColumnConstraints().add(
                    new ColumnConstraints(50)
            );
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    root.add(
                            new Rectangle(30, 30, Color.BLUE),
                            i,
                            j
                    );
                }
            }
        }

        Scene scene = new Scene(root, 200, 150);

        stage.setScene(scene);
        stage.setTitle("First stage");
        stage.show();

//        Stage secondStage = new Stage(StageStyle.DECORATED);
//        Stage secondStage = new Stage(StageStyle.TRANSPARENT);
//        Stage secondStage = new Stage(StageStyle.UNDECORATED);
//        Stage secondStage = new Stage(StageStyle.UTILITY);
//        secondStage.setTitle("Second stage");
//        secondStage.initModality(Modality.NONE);
//        secondStage.initModality(Modality.APPLICATION_MODAL);
//        secondStage.initOwner(stage);
//        secondStage.initModality(Modality.WINDOW_MODAL);
//        secondStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop");
    }
}
