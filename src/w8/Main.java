package w8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        new MyJFrame().setVisible(true); never do this !!!
//        2 acceptable options below:
//        Option 1
//        EventQueue.invokeLater(
//                () -> {
//                    JFrame jf = new MyJFrame();
//
//                    jf.setVisible(true);
//                }
//        );

//         Option 2: (Preferred)
        SwingUtilities.invokeLater(
                () -> {
                    JFrame jf = new MyJFrame();

//                    JButton b1 = new JButton("text");

                    // Old version of adding elements
//                    jf.getContentPane().add(b1);

                    // Newer version of adding elements
//                    jf.add(b1);

                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jf.setVisible(true);
                }
        );
    }
}
