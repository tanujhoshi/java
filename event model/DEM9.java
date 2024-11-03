
import java.awt.*;
import java.awt.event.*;

public class DEM9 {
    public static void main(String[] args) {
        Frame frame1 = new Frame("Frame 1");
        frame1.setSize(300, 200);
        frame1.setLayout(new FlowLayout());
        Button switchToFrame2 = new Button("Go to Frame 2");
        frame1.add(switchToFrame2);
        Frame frame2 = new Frame("Frame 2");
        frame2.setSize(300, 200);
        frame2.setLayout(new FlowLayout());
        Button switchToFrame1 = new Button("Go to Frame 1");
        frame2.add(switchToFrame1);
        switchToFrame2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });
        switchToFrame1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                frame1.setVisible(true);
            }
        });
        frame1.setVisible(true);
        frame2.setVisible(false);
    }
}
