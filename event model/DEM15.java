
import java.awt.*;
import java.awt.event.*;

public class DEM15 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Display Text in Different Fonts");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(0, 1));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        for (String fontName : fontNames) {
            Label label = new Label("Sample text in " + fontName);
            label.setFont(new Font(fontName, Font.PLAIN, 20));
            frame.add(label);
        }
        frame.setVisible(true);
    }
}
