package w7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main2 extends Frame {

    public Main2() {

        Button btn = new Button("start/stop");

        btn.addActionListener(
                (evt) -> {
                    System.out.println("Click");
                }
        );

        this.add(btn, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setBackground(Color.LIGHT_GRAY);

        this.add(panel, BorderLayout.CENTER);

        panel.setLayout(new FlowLayout());

        MyPanel myPanel = new MyPanel(Color.BLUE);
        GeneratorPanel generatorPanel = new GeneratorPanel(Color.RED);

        panel.add(myPanel);
        panel.add(generatorPanel);

        ResponsePanel responsePanel = new ResponsePanel(Color.GREEN);
        panel.add(responsePanel);

        generatorPanel.addColorListener(responsePanel);

        btn.addActionListener(
                (evt) -> {
                    myPanel.generateColor();
                }
        );

        setSize(640, 480);
        setVisible(true);

        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        System.exit(0);
                    }
                }
        );
    }

    public static void main(String[] args) {
        new Main2();
    }
}
