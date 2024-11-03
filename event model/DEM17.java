
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DEM17 extends Applet implements ActionListener {
    Button changeColorButton;

    public void init() {
        changeColorButton = new Button("Change Background Color");
        changeColorButton.addActionListener(this);
        add(changeColorButton);
    }

    public void actionPerformed(ActionEvent e) {
        Color newColor = new Color((int) (Math.random() * 0x1000000));
        setBackground(newColor);
    }
}
