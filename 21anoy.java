import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class anony
{
public anony()
{
JFrame f= new JFrame();
JButton b=new JButton();
JLabel l=new JLabel();
f.add(l);
f.add(b);
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.setDefaultCloseOperation(3);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
l.setText("Welcome");
}
});
}
public static void main(String args[])
{
new anony();
}
}
