
import java.awt.*;

class awt11 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        Choice ctrl5 = new Choice();
        f.setTitle("MyNotepad");
        f.setBounds(100, 100, 300, 300);
        ctrl5.setBounds(100, 50, 50, 50);
        f.add(ctrl5);
        ctrl5.add("C");
        ctrl5.add("C#");
        ctrl5.add("JAVA");
        ctrl5.add("C++");
        ctrl5.add("VB");
        f.setVisible(true);
    }
}
