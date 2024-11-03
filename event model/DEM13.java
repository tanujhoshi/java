
import java.awt.*;
import java.awt.event.*;

public class DEM13 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("WindowAdapter Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        Label label = new Label("Click the close button to exit.");
        frame.add(label);
        Button closeButton = new Button("Close");
        frame.add(closeButton);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}
