import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class pra10a extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5;
Button b1,b2,b3,b4;
TextField t1,t2,t3;
public pra10a()
{
l1=new Label("Name");
l2=new Label("Phone"); 
l3=new Label("Address");
l4=new Label("Result");
l5= new Label("");
b1=new Button("Submit"); 
b2=new Button("Clear"); 
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
setLayout(new GridLayout(5,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(l4);
add(l5);
b1.addActionListener(this);
b2.addActionListener(this);
setSize(300,300);
setVisible(true);
addWindowListener(new WindowAdapter()
{ 
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
public static void main(String[] ar)
{
new pra10a();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String data = "Student name:"+t1.getText();
l4.setText(data);
String 
data1="phone:"+t2.getText()+"address"+t3.getText();
l5.setText(data1);
}
else if(e.getSource()==b3)
{
t1.setText("");
t2.setText("");
t3.setText("");
l4.setText("");
l5.setText("");
}
}
}
