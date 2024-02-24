import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Adap 
{
  JFrame f;
  public Adap()
  {
    f = new JFrame();
    f.setVisible(true);
    f.setLayout(null);
    f.setSize(500,500);
    WindowListener t = new WindowAdapter()
    {
        public void windowClosing(WindowEvent e)
          {
               System.exit(0);
          }
    };
  f.addWindowListener(t);
  }
  public static void main(String[] args)
  {
      new Adap();
  }
}
