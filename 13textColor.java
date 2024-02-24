import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class textcolor implements ActionListener
{
JButton b;
JTextArea ta;
public textcolor()
{

JFrame f=new JFrame("color chooser");
ta=new JTextArea(20,30);
 b=new JButton("select color");
JScrollPane sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
JPanel p=new JPanel();
p.add(b);
p.add(sp);
f.add(p);
f.pack();
f.setSize(800,800);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(3);
b.addActionListener(this);		
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
JColorChooser cc=new JColorChooser();
Color color=JColorChooser.showDialog(null,"pick color",Color.black);
ta.setForeground(color);
}
}
public static void main(String args[])
{
new textcolor();
}
}
