
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class db
{
public static void main(String args[])
{
JFrame f=new JFrame();
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(3);

DefaultTableModel tm=new DefaultTableModel();
tm.addColumn("roll no");
tm.addColumn("name");
JTable t=new JTable(tm);
JScrollPane sp=new JScrollPane(t);
f.add(sp);

try
{

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/syit","root","123456");
Statement s=con.createStatement();
ResultSet rs=s.executeQuery("select * from stud");
while(rs.next())
{
Object[] row=new Object[2];
row[0]=rs.getObject(1);
row[1]=rs.getObject(2);
tm.addRow(row);

}
rs.close();
s.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
