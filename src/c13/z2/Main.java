package c13.z2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        SnowmanPane container = new SnowmanPane();
        Scene scene = new Scene(container, 600, 500);

        stage.setScene(scene);
        stage.show();
    }
}
