
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class pra10c extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7;
Checkbox cb1,cb2;
public pra10c()
{
l1= new Label("Roll No");
l2= new Label("Name:");
l3= new Label("Sub1 Marks:");
l4= new Label("Sub2 Marks:");
l5 =new Label("Sub3 Marks:");
l6= new Label("Total: ");
l7= new Label("Perccentage:");
l8= new Label("");
l9= new Label("");
l10= new Label("");
l11= new Label("");
CheckboxGroup cbg1 = new CheckboxGroup();
cb1= new Checkbox("Male",cbg1,false);
cb2= new Checkbox("Female",cbg1,false);
//adding components to the frame
b1 = new Button("Submit");
b2 = new Button("Clear");
t1= new TextField(10);
t2= new TextField(10);
t3= new TextField(10);
t4= new TextField(10);
t5= new TextField(10);
t6= new TextField(10);
t7= new TextField(10);
setLayout(new GridLayout(11,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(cb1);
add(cb2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(l6);
add(t6);
add(l7);
add(t7);
add(b1);
add(b2);
add(l8);
add(l9);
add(l10);
add(l11);
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
new pra10c();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int sub1= Integer.parseInt(t3.getText());
int sub2= Integer.parseInt(t4.getText());
int sub3= Integer.parseInt(t5.getText());
int sum = sub1+sub2+sub3;
float per=sum/3;
t6.setText(String.valueOf(sum));
t7.setText(String.valueOf(per));
String data = "Roll No:"+ t1.getText();
l8.setText(data);
String data1 = "Name:"+ t2.getText();
l9.setText(data1);
String data2 = "Sub1:"+ t3.getText()+ "Sub2:"+ t4.getText()+ 
"sub3:"+t4.getText();
l10.setText(data2);
String data3 = "Total:"+ t6.getText()+ "Per:"+ t7.getText();
l11.setText(data3);
}
else
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
cb1.setState(false);
} 
}
}