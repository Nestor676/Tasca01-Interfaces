
package com.mycompany.tasca01.dto;

import java.awt.*;
import javax.swing.table.*;

public class MiHeaderRenderer extends DefaultTableCellRenderer {

    public MiHeaderRenderer() {
        setBackground(Color.LIGHT_GRAY);
        setOpaque(true);
        setHorizontalAlignment(CENTER);
    }
}