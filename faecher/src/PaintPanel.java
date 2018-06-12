import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class PaintPanel extends JPanel {
    private BufferedImage imgbuf = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
    private Graphics2D img = (Graphics2D) imgbuf.getGraphics();

    public PaintPanel() {
        setPreferredSize(new Dimension(800, 600));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                img.setColor(Color.BLUE);
                img.drawLine(0, 0, e.getX(), e.getY());

                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawImage(imgbuf, 0, 0 , null);
    }
}
