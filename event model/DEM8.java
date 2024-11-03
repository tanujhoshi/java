


import java.awt.*;
import java.awt.event.*;

public class DEM8{
public static void main(String[] args) {
        Frame frame = new Frame("Checkboxes and Radio Buttons Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        Checkbox checkbox1 = new Checkbox("Option A");
        Checkbox checkbox2 = new Checkbox("Option B");
        Checkbox checkbox3 = new Checkbox("Option C");
        CheckboxGroup radioGroup = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("Choice 1", radioGroup, false);
        Checkbox radioButton2 = new Checkbox("Choice 2", radioGroup, false);
        Button showSelectionsButton = new Button("Show Selections");
        Label resultLabel = new Label("Selected Options:");
        showSelectionsButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                StringBuilder result = new StringBuilder("Selected Options:\n");
                if (checkbox1.getState()) {
                    result.append(checkbox1.getLabel()).append("\n");
                }
                if (checkbox2.getState()) {
                    result.append(checkbox2.getLabel()).append("\n");
                }
                if (checkbox3.getState()) {
                    result.append(checkbox3.getLabel()).append("\n");
                }
                if (radioButton1.getState()) {
                    result.append("Radio Selected: ").append(radioButton1.getLabel()).append("\n");
                } else if (radioButton2.getState()) {
                    result.append("Radio Selected: ").append(radioButton2.getLabel()).append("\n");
                }
                resultLabel.setText(result.toString());
            }});
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(showSelectionsButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }}





