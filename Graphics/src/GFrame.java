import javax.swing.*;

public class GFrame extends JFrame {
    public GFrame() {
        add(new GPanel());

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        new GFrame();
    }
}
