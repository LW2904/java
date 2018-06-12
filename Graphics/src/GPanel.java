import javax.swing.*;
import java.awt.*;

public class GPanel extends JPanel {
    public GPanel() {
        setPreferredSize(new Dimension(1000, 600));
    }

    @Override
    public void paint(Graphics gOld) {
        Graphics2D g = (Graphics2D) gOld;

        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g.drawRect(10, 10, 100, 100);
        g.drawRoundRect(230, 10, 100, 100, 100, 100);

        g.setColor(Color.BLUE);

        g.fillRect(120, 10, 100, 100);

        g.setColor(Color.RED);

        g.fillRoundRect(340, 10, 100, 100, 100, 100);

        g.setColor(Color.GREEN);

        g.drawRoundRect(340, 10, 100, 100, 100, 100);
    }
}
