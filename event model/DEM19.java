
import java.awt.*;
import java.awt.event.*;

public class DEM19 extends Frame implements KeyListener {
    TextField textField;

    public DEM19() {
        setTitle("Numeric Input Validation");
        setSize(300, 150);
        setLayout(new FlowLayout());
        textField = new TextField(15);
        textField.addKeyListener(this);
        add(textField);
        Label label = new Label("Enter numbers only:");
        add(label);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            e.consume();
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new DEM19();
    }
}
