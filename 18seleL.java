import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class SeleL extends JFrame implements ListSelectionListener {
    JLabel l;
    JList<String> li;

    public SeleL() {
        setTitle("selectionEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] a = { "JP", "COST", "ES", "SE", "CGA" };
        li = new JList<>(a); 
        li.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        l = new JLabel("Selected item"); 
        add(l);
        add(new JScrollPane(li));
        li.addListSelectionListener(this);
        setSize(300, 200);
        setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = li.getSelectedIndex();
        if (selectedIndex != -1) {
            l.setText("Selected item: " + li.getSelectedValue());
        }
    }

    public static void main(String args[]) {
       new SeleL();
    }
}
