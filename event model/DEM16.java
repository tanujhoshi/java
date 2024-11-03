
import java.awt.*;
import java.awt.event.*;

public class DEM16 {
    public static void main(String[] args) {
        Frame frame = new Frame("Change Background Color Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setBackground(Color.pink);
        Label label = new Label("The background color is now pink .");
        frame.add(label);
        frame.setVisible(true);
    }
}
