


import java.awt.*;
import java.awt.event.*;

public class DEM10{
public static void main(String[] args) {
        Frame frame = new Frame("Button with Border Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.BLACK);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.BLACK);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setForeground(Color.BLACK);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }});
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }});
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }});
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }}



