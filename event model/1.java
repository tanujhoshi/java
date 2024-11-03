
import java.awt.*;

class DEM1 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label ctrl = new Label();
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setBounds(100, 100, 200, 200);
        f.add(ctrl);
        f.setTitle("MyNotepad");
        ctrl.setText("Displaying Text in the frame : ");
        f.setVisible(true);
    }
}
