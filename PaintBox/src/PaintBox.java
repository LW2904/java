import javax.swing.*;

public class PaintBox extends JFrame {
    public PaintBox() {
        add(new PaintPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintBox();
    }
}
