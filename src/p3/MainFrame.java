package p3;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class MainFrame extends JFrame {
    public MainFrame() {
        JTable jTable = new JTable(new PersonTableModel());

        jTable.setDefaultRenderer(Color.class, new ColorRender());
        jTable.setDefaultRenderer(Integer.class, new IntRender());
        jTable.setDefaultRenderer(LocalDate.class, new DateRenderer());

        jTable.setEnabled(false);
        jTable.setShowGrid(true);
        jTable.setGridColor(Color.BLACK);

        add(new JScrollPane(jTable));
    }
}
