


import java.awt.*;
class DEM2 extends Frame{
public static void main(String[] args){
Frame f=new Frame();
Label l1=new Label();
TextArea ta=new TextArea("This is TextArea",10,20);
Label l2=new Label();
TextField tf=new TextField("Enter a value !",20);
f.setTitle("MyNotepad");
f.setLayout(new FlowLayout(FlowLayout.LEFT));
l1.setText("Text Area : ");
l2.setText("Password Field : ");
f.setBounds(100,100,300,300);
f.add(l1);
f.add(ta);
f.add(l2);
f.add(tf);
f.setVisible(true);
}
}



