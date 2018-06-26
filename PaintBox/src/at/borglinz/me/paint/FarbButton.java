package at.borglinz.me.paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarbButton extends JButton {
    public FarbButton(int farbe){
        setBackground(new Color(farbe));
        setPreferredSize(new Dimension(20,20));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.farbe = farbe;
            }
        });

    }
}
