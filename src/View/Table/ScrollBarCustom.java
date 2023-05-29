package View.Table;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom(int orientation) {
        setOrientation(orientation); // Mengatur orientasi scrollbar
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(91, 88, 99));
        setBackground(new Color(30, 30, 30));
    }

}
