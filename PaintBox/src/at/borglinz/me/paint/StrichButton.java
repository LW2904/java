package at.borglinz.me.paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StrichButton extends JButton {
    int breite;
    public StrichButton(int breite){
        this.breite = breite;
        repaint();
        setPreferredSize(new Dimension(80, 20));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.strichbreite = breite;
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 80 , 20);
        g.setColor(Color.black);
        g.fillRect(2, 20/2-breite/2, 75, breite);
    }
}
