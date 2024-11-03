
import java.awt.*;
import java.awt.event.*;

public class DEM7 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Example");
        Checkbox checkbox = new Checkbox("Enable Option");
        Button getStateButton = new Button("Get State");
        Button setStateButton = new Button("Set State");
        Label label = new Label("Checkbox is unchecked");
        getStateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean isSelected = checkbox.getState();
                label.setText("Checkbox is " + (isSelected ? "checked" : "unchecked"));
            }
        });
        setStateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkbox.setState(!checkbox.getState());
                label.setText("Checkbox is " + (checkbox.getState() ? "checked" : "unchecked"));
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(checkbox);
        frame.add(getStateButton);
        frame.add(setStateButton);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
