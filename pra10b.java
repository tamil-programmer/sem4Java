import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class pra10b implements ActionListener
{
Frame f= new Frame();
Label l1=new Label("First numnber:");
Label l2=new Label("Second Number:"); 
Label l3=new Label("Result");
TextField t1= new TextField();
TextField t2= new TextField();
TextField t3= new TextField();
Button b1=new Button("Add"); 
Button b2=new Button("Sub"); 
Button b3=new Button("Mul"); 
Button b4=new Button("Div"); 
Button b5=new Button("Clear"); 
public pra10b()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
l3.setBounds(50,180,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
b4.setBounds(230,250,50,20);
b5.setBounds(290,250,50,20);
//adding components to the frame
// setLayout(new GridLayout(5,2));
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
f.setLayout(null);
f.setSize(400,350);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{ 
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
public void actionPerformed(ActionEvent e)
{
int n1= Integer.parseInt(t1.getText());
int n2= Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b5)
{
t1.setText("");
t2.setText("");
t3.setText("");
} 
}
public static void main(String[] ar)
{
new pra10b();
}
}
