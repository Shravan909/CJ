import java.awt.event.*;
import javax.swing.*;

public class ActiL implements ActionListener
{
    JTextField t;
    public ActiL()
    {
       JFrame f = new  JFrame("Action Listener");
       JButton b = new JButton("click !!");
       t = new JTextField();
       t.setBounds(150,90,70,180);
       b.setBounds(150,70,70,30);
       f.add(b);
       f.add(t);
       f.setSize(500,500);
       f.setVisible(true);
       f.setLayout(null);
       f.setDefaultCloseOperation(3);
       b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       t.setText("Welcome");
    }
    public static void main(String[] args)
    {
       new ActiL();
    }
}
