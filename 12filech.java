import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Filech implements ActionListener
{
      JFrame f;
      JTextArea ta;
      JButton b;
      JPanel p;
      public Filech()
      {
            f = new JFrame();
            ta =  new JTextArea(20,25);
            p = new JPanel();
            b = new JButton("Click");
            b.setBounds(80,20,30,60);
            p.setBounds(50,80,200,200);
            JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            p.add(b);
            p.add(sp);
            f.add(p);
            f.setSize(500,500);
            f.setVisible(true);
            f.setDefaultCloseOperation(3);
            f.setLayout(null);
            b.addActionListener(this);
     }
      public void actionPerformed(ActionEvent e)
      {
           try
           {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(null);
                String path = fc.getSelectedFile().getAbsolutePath();
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                ta.read(br,null);
                br.close();
                ta.requestFocus();
           }
           catch(Exception ex)
           {
                ex.printStackTrace();
           }

      }
      public static void main(String[] args)
      {
            new Filech();
      }
}
