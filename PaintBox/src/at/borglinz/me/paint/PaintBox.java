package at.borglinz.me.paint;

import javax.swing.*;
import java.awt.*;

public class PaintBox extends JFrame {
    public PaintBox(){
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100, 100);
        add(new PaintPanel());
        add(new StrichWahl());
        add(new FarbWahl());

        setSize(950, 750);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintBox();
    }
}
