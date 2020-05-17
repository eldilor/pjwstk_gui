package w10;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        JTable jTable = new JTable();

        /*
        jTable.setModel(new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return 10;
            }

            @Override
            public int getColumnCount() {
                return 10;
            }

            @Override
            public Object getValueAt(int i, int i1) {
                return (i+1) * (i1 + 1);
            }
        });
        */

        jTable.setModel(new StudentTableModel());

//        jTable.setDefaultRenderer(Boolean.class, ***);


        add(jTable);
    }
}
