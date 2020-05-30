package p3;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class IntRender extends JLabel implements TableCellRenderer {
    public IntRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        int val = (int) jTable.getModel().getValueAt(row, column);

        setBackground(Color.WHITE);
        setFont(this.getFont().deriveFont(Font.PLAIN));

        if (column == 4 || column == 5) setHorizontalAlignment(JLabel.RIGHT);
        if (column == 6) {
            if (val > 25) setBackground(Color.RED);
            if (val < 18) setBackground(Color.YELLOW);

            setHorizontalAlignment(JLabel.CENTER);
            setFont(this.getFont().deriveFont(Font.BOLD));
        }

        setText(val + "");

        return this;
    }
}
