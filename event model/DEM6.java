
import java.awt.Graphics;
import java.awt.Button;
import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DEM6 extends Applet implements MouseListener

{

    Button b1 = new Button("Clicked 0 times");
    int i = 0;

    public void init() {
        add(b1);
        b1.addMouseListener(this);
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {

        System.out.println("Clicked");

    }

    public void mousePressed(java.awt.event.MouseEvent e)

    {
        System.out.println("Pressed");
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Released");
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {

        System.out.println("Entered");
    }

    public void mouseExited(java.awt.event.MouseEvent e) {

        System.out.println("Exited");
    }

}
