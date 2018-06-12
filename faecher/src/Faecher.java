import javax.swing.*;

public class Faecher extends JFrame {
    public Faecher() {
        pack();

        add(new PaintPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Faecher();
    }
}
