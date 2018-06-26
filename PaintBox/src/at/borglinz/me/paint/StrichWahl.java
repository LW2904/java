package at.borglinz.me.paint;

import javax.swing.*;
import java.awt.*;

public class StrichWahl extends JPanel {
    public StrichWahl(){
        setPreferredSize(new Dimension(100, 600));
        //setBackground(new Color(0xD10009));
        add(new StrichButton(1));
        add(new StrichButton(2));
        add(new StrichButton(5));
        add(new StrichButton(8));
        add(new StrichButton(10));
    }
}
