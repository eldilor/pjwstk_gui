package p3;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateRenderer extends JLabel implements TableCellRenderer {
    public DateRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        LocalDate date = (LocalDate) jTable.getModel().getValueAt(row, column);

        setText(date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("hu", "HU")));

        return this;
    }
}
