import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class FocuL implements FocusListener
{
  JFrame f;
  TextField t1,t2;
  public FocuL()
  {
    f = new JFrame();
    t1 = new TextField();
    t2 = new TextField();
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);
    f.setSize(500,500);
    t1.setBounds(150,50,40,40);
    t2.setBounds(80,50,40,40);
    f.add(t1);
    f.add(t2);
    t2.addFocusListener(this);
  }
   public void focusLost(FocusEvent e)
  {
    t2.setBackground(Color.GREEN);
  }
  public void focusGained(FocusEvent e)
  {
    t2.setBackground(Color.YELLOW);
  }
  public static void main(String[] args)
  {
      new FocuL();
  }
}
