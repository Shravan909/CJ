import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyL implements KeyListener
{
    JLabel l;
    public KeyL()
    {

       JFrame f = new JFrame();
       JTextArea t = new JTextArea(10,15);
       l = new JLabel();
       f.add(l);
       f.add(t);
       f.setSize(500,500);
       f.setVisible(true);
       f.setLayout(new FlowLayout());
       f.setDefaultCloseOperation(3);
       t.addKeyListener(this);
    } 
    public void keyPressed(KeyEvent e)
    {
       l.setText("Pressed");
    }
    public  void keyTyped(KeyEvent e)
    {
       l.setText("Typed");
    }
    public void keyReleased(KeyEvent e)
    {
       l.setText("Released");
    }

    public static void main(String[] args)
    {
       new KeyL();
    }


}
