import javax.swing.*;

public class MausWindow extends JFrame {
    public MausWindow() {
        add(new MausPanel());

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        new MausWindow();
    }
}
