import com.sun.imageio.stream.CloseableDisposerRecord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MausPanel extends JPanel {
    JLabel xy = new JLabel("x/y");
    JLabel status = new JLabel("status");

    public MausPanel() {
        setPreferredSize(new Dimension(800, 600));

        xy.setPreferredSize(new Dimension(100, 20));

        status.setPreferredSize(new Dimension(100, 20));
        status.setOpaque(true);

        add(xy);
        add(status);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                status.setText("clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                status.setText("pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                status.setText("released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                status.setText("exited");
            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                status.setBackground(Color.RED);

                xy.setText(e.getX() + "/" + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                status.setBackground(Color.GREEN);

                xy.setText(e.getX() + "/" + e.getY());
            }
        });
    }
}
