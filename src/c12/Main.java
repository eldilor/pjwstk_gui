package c12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane container = new GridPane();
        Scene scene = new Scene(container, 600, 500);

        container.prefHeightProperty().bind(scene.heightProperty());

        container.setGridLinesVisible(true);

        ColumnConstraints leftColumn = new ColumnConstraints();
        leftColumn.setPercentWidth(50);

        ColumnConstraints rightColumn = new ColumnConstraints();
        rightColumn.setPercentWidth(50);

        container.getColumnConstraints().add(leftColumn);
        container.getColumnConstraints().add(rightColumn);

        ChatStorage chatStorage = new ChatStorage();

        ChatPanel leftChat = new ChatPanel("Juliet", chatStorage);
        ChatPanel rightChat = new ChatPanel("Romeo", chatStorage);

        chatStorage.attach(leftChat);
        chatStorage.attach(rightChat);

        container.add(leftChat, 0,0);
        container.add(rightChat, 1,0);

        stage.setScene(scene);
        stage.show();
    }
}
