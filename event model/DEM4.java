
import java.awt.*;
import java.awt.event.*;

public class DEM4 extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Radio Button Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        CheckboxGroup group = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("Option 1", group, false);
        Checkbox radioButton2 = new Checkbox("Option 2", group, false);
        Label selectedLabel = new Label("Selected: None");
        radioButton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton1.getState()) {
                    selectedLabel.setText("Selected: " + radioButton1.getLabel());
                }
            }
        });

        radioButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton2.getState()) {
                    selectedLabel.setText("Selected: " + radioButton2.getLabel());
                }
            }
        });
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(selectedLabel);
        frame.setVisible(true);
    }
}
