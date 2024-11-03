import java.awt.*;
import java.awt.event.*;
public class DEM3 extends Frame implements ActionListener {
Button displayButton;    
Image image;
      
public void actionPerformed(ActionEvent e) {
              
image = Toolkit.getDefaultToolkit().getImage("C:\Users\Nayan joshi\OneDrive\Pictures\WhatsApp Image 2023-11-02 at 08.35.38_abb266fb.jpg");      
repaint();
    
}

      
public void paint(Graphics g) {
             
if (image != null) {
            
g.drawImage(image, 100, 100, this);
        
}
}

    
public static void main(String[] args) {
            
DEM3 frame = new DEM3();
        
frame.setTitle("Simple Image Display");
        
frame.setSize(700, 700);
        
frame.setLayout(new FlowLayout());

                    
Button displayButton = new Button("Show Image");
        
frame.displayButton = displayButton;
        
displayButton.addActionListener(frame);
        
             
frame.add(displayButton);

             
frame.setVisible(true);
    
}
}




