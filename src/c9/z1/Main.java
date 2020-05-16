package c9.z1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> {
                    JFrame jf = new JFrame();

                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setVisible(true);
                    jf.setSize(new Dimension(500, 500));

                    jf.add(new SnowmanJPanel());
                }
        );
    }
}
