package p3;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ColorRender extends JLabel implements TableCellRenderer {
    public ColorRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Color color = (Color) jTable.getModel().getValueAt(row, column);

        setBackground(color);

        return this;
    }
}
