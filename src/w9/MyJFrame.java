package w9;


import javax.swing.*;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        // Scroll
        /*
        MyImageJPanel mip = new MyImageJPanel();

        JScrollPane jsp = new JScrollPane(mip);
        add(jsp);
        */

        // Select/lista
        /*
        String options[] = {
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 5",
        };

        JComboBox jcb = new JComboBox(options);
        add(jcb);

        jcb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e);
            }
        });

        JList jl = new JList(options);
        add(jl);
        */

        JComboBox jcb = new JComboBox();

        jcb.setModel(new StudentModel());

        jcb.setRenderer(
            new StudentRenderer()
        );
        add(jcb);
    }

}
