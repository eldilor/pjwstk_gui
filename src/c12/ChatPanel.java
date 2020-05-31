package c12;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class ChatPanel extends GridPane {
    private Button button;
    private TextField input;
    private Label chat;
    private String username;
    private ChatStorage chatStorage;

    public ChatPanel(String username, ChatStorage chatStorage) {
        super();

        this.username = username;
        this.chatStorage = chatStorage;

        GridPane inputContainer = new GridPane();

        this.input = new TextField();
        this.button = new Button("Send");

        this.button.setOnAction(this::sendMessage);

        inputContainer.add(this.input, 0, 0);
        inputContainer.add(this.button, 1, 0);

        ColumnConstraints inputColumnConstraints = new ColumnConstraints();
        inputColumnConstraints.setHgrow(Priority.ALWAYS);
        inputContainer.getColumnConstraints().add(inputColumnConstraints);

        add(inputContainer, 0, 1);

        this.chat = new Label();
        this.chat.setAlignment(Pos.TOP_LEFT);
        add(this.chat, 0, 0);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setVgrow(Priority.ALWAYS);
        rowConstraints.setValignment(VPos.TOP);

        getRowConstraints().add(rowConstraints);

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100);

        getColumnConstraints().add(columnConstraints);

        setVgrow(this, Priority.ALWAYS);
    }

    private void sendMessage(ActionEvent e) {
        String message = input.getText();

        if (message.length() > 0) {
            chatStorage.addMessage(username, message);
        }

        input.setText("");
    }

    public void refresh() {
        chat.setText(chat.getText() + chatStorage.getMessages().peek());
    }
}
