
import java.awt.*;
import java.awt.event.*;

public class DEM14 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Available Fonts");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        List fontList = new List(fontNames.length, false);
        for (String fontName : fontNames) {
            fontList.add(fontName);
        }
        frame.add(fontList);
        frame.setVisible(true);
    }
}
