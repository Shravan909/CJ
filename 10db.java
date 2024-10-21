
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


RFID
https://www.tinkercad.com/things/ahaF30vzxsJ-rfid/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard%2Fdesigns%2Fcircuits&sharecode=ug-ZCcXD5FHc-RR7gimdO6RsaDHwWbyDKUEVPSuzeCA

ossicallator
https://www.tinkercad.com/things/lOTLRR3VOLx-oscilloscope/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard%2Fdesigns%2Fcircuits&sharecode=chSKM2F3rtYW4n1X_GFG8c2noTWU6grLU8n3otqvGiM

Gps locator
https://www.tinkercad.com/things/aSN6uO7gQyX-gps-locator-using-arduino/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard%2Fdesigns%2Fcircuits&sharecode=pbMDqjSaz7WLWJziXRSUGESurSXlaa3K44tLta8IOtc

LED
https://www.tinkercad.com/things/8Gz9wsBbRcz-led-patterns/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard%2Fdesigns%2Fcircuits&sharecode=8u8wPjAnhL1P8tT0bANU9V-t_eaoVvV7ADuphCQmnB8

display different messages
https://www.tinkercad.com/things/65jNhkaCNjC-display-different-message/editel?returnTo=https%3A%2F%2Fwww.tinkercad.com%2Fdashboard%2Fdesigns%2Fcircuits&sharecode=Naz3FgeC2aG5wqjBHfdCoQma1OHmE4okaoSDClUQSkI



Home appliance



7 segment










https://docs.google.com/document/d/13z_zy10KI6rtX9CNLX84Q45teH1ahO10sS2hj6ec3to/edit?tab=t.0


Arduino Uno R3: 
A programmable board you can use to build interactive circuits. 
BreadBoard Small: 
A half-size breadboard with 30 rows,10 columns, and two pairs of power rails. 
Resistor: 
Restricts the flow of electricity in a circuit, reducing the voltage and current as a result. 
LED: 
Light- Emitting Diode that lights up when electricity passes through it in the correct direction. 
BreadBoard Mini: 
A quarter-size breadboard with 17 rows and 10 columns. 
7 segment Display: 
A single 7-segment LED for displaying a number of letter. 
LCD 16 X 2: 
A Liquid Crystal Display capable of displaying two lines of 16 characters. 
Pushbutton: 
A switch that closes a circuit while pressed. 
Temperature Sensor: 
A sensor that outputs different voltages based on the ambient temperature. 
Oscilloscope: 
Electronic test equipment for measuring output signals. 
Potentiometer: 
A type of resistor whose resistance changes at the turn of a knob. 
LED RGB: 
A type of LED that combines Red, Blue, and Green to produce any color. 
PIR Sensor: 
Passive infrared motion sensor used to sense motion in front of it.
DC Motor: 
A motor,which converts electrical energy into mechanical energy. 
Photoresistor: 
A sensor whose resistance changes based on the amount of light it senses. 
Power Supply: 
Electronic test equipment for supplying power to your circuit. 
Relay SPDT: 
A 5V SPDT power relay for switching between two circuits. 
Light Bulb: 
A 12V/ 3W incandescent light bulb. 
0 Raspberry Pi Components 
GPIO Pins (General Purpose Input/Output): 
Raspberry Pi has a set of GPIO pins that allow it to interface with external hardware, such as sensors, motors, and other devices. These pins can be programmed for input (to read data) or output (to send signals). 
Power Supply: 
Raspberry Pi is typically powered by a 5V micro USB or USB-C power supply. It is important to provide a stable and sufficient power supply to prevent issues during operation. 
MicroSD Card: 
Raspberry Pi uses a microSD card as its primary storage device. The operating system (like Raspberry Pi OS) and all programs are stored on this card. 
HDMI Port: 
Raspberry Pi has an HDMI port that allows it to be connected to a monitor or TV. This makes it easy to use as a desktop computer or display visual outputs from projects. 
USB Ports: 
Multiple USB ports are available for connecting peripherals like keyboards, mice, or USB storage devices. 
Ethernet/Wi-Fi: 
Some models come with Ethernet ports for wired internet connectivity. Wi-Fi is built into many modern Raspberry Pi models for wireless communication.
Camera and Display Interface: 
The Raspberry Pi has dedicated ports for connecting cameras (using the Camera Serial Interface, CSI) and displays (using the Display Serial Interface, DSI). This makes it suitable for visual recognition or surveillance projects. 
Add-on Modules and Shields: 
Common add-ons include sensors (temperature, motion, etc.), actuators (motors), and shields that expand its capabilities. For example, the Raspberry Pi can be integrated with GPS modules, RFID readers, or LCD displays for interactive projects
Footer
© 2024 GitHub, Inc.
