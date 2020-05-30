package p3;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
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

        DefaultTableCellRenderer tableHeaderRenderer = (DefaultTableCellRenderer) jTable.getTableHeader().getDefaultRenderer();
        tableHeaderRenderer.setHorizontalAlignment(JLabel.CENTER);

        add(new JScrollPane(jTable));
    }
}
