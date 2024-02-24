//7a

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
public class layout1
{
JFrame f;
  public layout1()
{
f=new JFrame("Flow layout");
JButton b1=new JButton("B1");
JButton b2=new JButton("B2");
JButton b3=new JButton("B3");
JButton b4=new JButton("B4");
JButton b5=new JButton("B5");
JButton b6=new JButton("B6");
JButton b7=new JButton("B7");
JButton b8=new JButton("B8");
JButton b9=new JButton("B9");
JButton b10=new JButton("B10");
//border layout
/*f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
f.add(b6,BorderLayout.CENTER);
f.add(b7,BorderLayout.CENTER);*/
//gridlayout
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.setLayout(new GridLayout(2,3));

//f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);
//f.add(b9);f.add(b10);
f.setSize(300,300);
f.setVisible(true);
f.setLayout(new BorderLayout(20,12));
//f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
f.setDefaultCloseOperation(3);
}


public static void main(String args [])
{
new layout1();
}
}
