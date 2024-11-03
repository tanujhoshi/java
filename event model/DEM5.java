
import java.awt.*;
import java.awt.event.*;

public class DEM5 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Keyboard Event Example");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        Label label = new Label("Press any key...");
        frame.add(label);
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();
                label.setText("Key Pressed: " + keyChar + " (Key Code: " + keyCode + ")");
            }
        });
        frame.setVisible(true);
        frame.requestFocus();
    }
}
