
import java.awt.*;
import java.awt.event.*;

public class DEM11 {
        public static void main(String[] args) {
                Frame frame = new Frame("List Box Example");
                frame.setSize(400, 300);
                frame.setLayout(new FlowLayout());
                List listBox = new List(5, true);
                listBox.add("Apple");
                listBox.add("Banana");
                listBox.add("Cherry");
                listBox.add("Date");
                listBox.add("Fig");
                listBox.add("Grape");
                Button showSelectionButton = new Button("Show Selected Items");
                Label resultLabel = new Label("Selected Items: None");
                showSelectionButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String[] selectedItems = listBox.getSelectedItems();
                                if (selectedItems.length > 0) {
                                        StringBuilder result = new StringBuilder("Selected Items: ");
                                        for (String item : selectedItems) {
                                                result.append(item).append(", ");
                                        }
                                        result.setLength(result.length() - 2);
                                        resultLabel.setText(result.toString());
                                } else {
                                        resultLabel.setText("Selected Items: None");
                                }
                        }
                });
                frame.add(listBox);
                frame.add(showSelectionButton);
                frame.add(resultLabel);
                frame.setVisible(true);
        }
}
