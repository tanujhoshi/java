
import java.awt.*;

class awt1 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b1 = new Button("Click1");
        Button b2 = new Button("Click2");
        f.setTitle("MyNotepad");
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setBounds(50, 50, 300, 300);
        b1.setBounds(100, 100, 100, 50);
        b2.setBounds(200, 100, 100, 50);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }
}
