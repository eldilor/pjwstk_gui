package c12;

import java.util.ArrayList;
import java.util.Stack;

public class ChatStorage {
    private ArrayList<ChatPanel> chats = new ArrayList<>();
    private Stack<String> messages = new Stack<>();

    private void notifyChats() {
        for (ChatPanel chatPanel : chats) {
            chatPanel.refresh();
        }
    }

    public void attach(ChatPanel chatPanel) {
        chats.add(chatPanel);
    }

    public void addMessage(String username, String message) {
        messages.push(username + ": " + message + "\n");
        notifyChats();
    }

    public Stack<String> getMessages() {
        return messages;
    }
}
