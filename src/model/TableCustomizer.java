//File Location (inside package model)
package model;

//Import packages and classes
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TableCustomizer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setOpaque(true);
        
        // Align text in vertical alignment within the cell
        label.setVerticalAlignment(SwingConstants.CENTER);
        
        // Align text in horizontal alignment within the cell
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        String htmlText;
        // Use HTML to allow text wrapping
        //Using Ternary Conditional Operator (? :) to simplify the code.
        switch (column){
            case 0:
            htmlText = "<html><body style='width: 100px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            label.setText(htmlText);
            break; 
            case 1:
            htmlText = "<html><body style='width: 100px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            label.setText(htmlText);
            break; 
            case 3:
            htmlText = "<html><body style='width: 60px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            label.setText(htmlText);
            break;
            case 4:
            htmlText = "<html><body style='width: 70px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            label.setText(htmlText);
            break;
            case 5:
            htmlText = "<html><body style='width: 150px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            label.setText(htmlText);
            break;
            case 6:
            if (table.getName() != null){
                htmlText = "<html><body style='width: 100px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            }
            else {
            htmlText = "<html><body style='width: 150px;'>" + (value != null ? value.toString() : "") + "</body></html>";
            }
            label.setText(htmlText);
            break;
        }

        // Set a preferred cell height to accommodate multiple lines of text
        int cellHeight = label.getFontMetrics(label.getFont()).getHeight();
        
        //Multiplier adjusted to 10x from the height of the cell
        table.setRowHeight(row, cellHeight * 10);

        return label;
    }
}

