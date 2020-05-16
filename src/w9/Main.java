package w9;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> {
                    JFrame jf = new MyJFrame();

                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setVisible(true);
                    jf.setSize(new Dimension(500, 500));
                }
        );
    }
}
