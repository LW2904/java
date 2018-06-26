package at.borglinz.me.paint;

import javax.swing.*;
import java.awt.*;

public class FarbWahl extends JPanel {
    public FarbWahl(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setPreferredSize(new Dimension(900, 100));
        //setBackground(new Color(0x3AFF00));
        add(new FarbButton(0xFF0000));
        add(new FarbButton(0x00FF00));
        add(new FarbButton(0x00FFFF));
    }
}
