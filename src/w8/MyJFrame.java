package w8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        JPanel jp = new JPanel();

        jp.setLayout(new BorderLayout());

        jp.add(new MyBorderLayout(), BorderLayout.PAGE_START);
        jp.add(new MyPaintComponent(), BorderLayout.CENTER);
        jp.add(new MyBoxLayout(), BorderLayout.LINE_START);
        jp.add(new MyFlowLayout(), BorderLayout.LINE_END);

        JSlider js = new JSlider();
        JPanel jp1 = new JPanel();
        jp1.add(js);

        js.addChangeListener(e -> System.out.println(js.getValue()));

        add(
//            new MyPaintComponent()
//                new MyBorderLayout()
//                new MyFlowLayout()
//                new MyBoxLayout()
//                jp
                jp1
        );
        pack(); // adjust window size to optimal size based on components inside
    }
}
