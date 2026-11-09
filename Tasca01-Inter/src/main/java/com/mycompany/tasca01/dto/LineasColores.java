package com.mycompany.tasca01.dto;

import com.mycompany.tasca01.gestion.GestionDatos;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class LineasColores extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        int fila = table.convertRowIndexToModel(row);

        Lloguer l = GestionDatos.lloguers.get(fila);

        Date hoy = new Date();

        if (l.getDevolver().before(hoy) && !l.isRetornat()) {
            c.setBackground(Color.RED);
        } else if (l.isRetornat()) {
            c.setBackground(Color.GREEN);
        } else {
            c.setBackground(Color.YELLOW);
        }

        c.setForeground(Color.BLACK);

        if (isSelected) {
            c.setBackground(table.getSelectionBackground());
            c.setForeground(table.getSelectionForeground());
        }

        return c;
    }
}
