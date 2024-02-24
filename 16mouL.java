import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouL implements MouseListener
{
  JLabel l;
  JFrame f;
  public MouL()
  { 
     f =new JFrame();
     l = new JLabel();
     f.add(l);
     f.setSize(500,500);
     f.setVisible(true);
     f.setLayout(new FlowLayout());
     f.setDefaultCloseOperation(3);
     f.addMouseListener(this);

  }
  public void mouseClicked(MouseEvent e)
  {
      l.setText("Clicked");
  }
public void mouseReleased(MouseEvent e2)
  {
      l.setText("Released");
  }
  public void mouseEntered(MouseEvent e)
  {
      l.setText("Entered");
  }
  public void mousePressed(MouseEvent e)
  {
      l.setText("Pressed");
  }
  public void mouseExited(MouseEvent e)
  {
      l.setText("Exited");
  }
  public static void main(String[] args)
  {
      new MouL();
  }
}
