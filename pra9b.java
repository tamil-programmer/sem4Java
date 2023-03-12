import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class pra9b extends Frame implements ActionListener
{
Label l1,l2,l3;
Button b1,b2,b3,b4;
TextField t1,t2,t3;
public pra9b()
{
l1=new Label("1st String: ");
l2=new Label("2nd String: "); 
l3=new Label("Result");
b1=new Button("Reverse for 1st"); 
b2=new Button("Concat 1st+2nd");
b3=new Button("Clear");
b4=new Button("Length for 1st");
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
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this); 
b4.addActionListener(this); 
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
new pra9b();
}
public void actionPerformed(ActionEvent e)
{
String result;
StringBuilder str;
if(e.getSource()==b1)
{
str=new StringBuilder(); str.append(t1.getText()); 
str.reverse();
t3.setText(str.toString());
}
else if(e.getSource()==b2)
{
result=(t1.getText()).concat(t2.getText());
t3.setText(result);
}
else if(e.getSource()==b3)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
else
{
str=new StringBuilder();
str.append(t1.getText());
int a=str.length(); 
t3.setText(String.valueOf(a));
}
}
}
