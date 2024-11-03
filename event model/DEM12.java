


import java.awt.*;
import java.awt.event.*;
public class DEM12{
public static void main(String[] args) {
        Frame mainFrame = new Frame("Main Frame");
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new FlowLayout());
        Button openMessageButton = new Button("Open Message Frame");
        mainFrame.add(openMessageButton);
        openMessageButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                Frame messageFrame = new Frame("Message Frame");
                messageFrame.setSize(200, 100);
                messageFrame.setLayout(new FlowLayout());
                Label messageLabel = new Label("Hello! This is your message.");
                messageFrame.add(messageLabel);
                Button closeButton = new Button("Close");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        messageFrame.dispose();
                    }});
                messageFrame.add(closeButton);
                messageFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        messageFrame.dispose();
                    }});
                messageFrame.setVisible(true);
                messageFrame.setLocationRelativeTo(null); 
            }});
        mainFrame.setVisible(true);
    }}





