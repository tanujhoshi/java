
import java.awt.*;

class awt10 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        Choice ctrl5 = new Choice();
        f.setTitle("MyNotepad");
        f.setSize(200, 200);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        ctrl5.setBounds(50, 50, 200, 200);
        f.setSize(200, 200);
        f.add(ctrl5);
        ctrl5.add("C");
        ctrl5.add("C#");
        ctrl5.add("JAVA");
        ctrl5.add("C++");
        ctrl5.add("VB");
        f.setVisible(true);
    }
}
