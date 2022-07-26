import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc_button implements ActionListener {
static JFrame c1 = new JFrame();
Runtime runtime = Runtime.getRuntime();
JButton one,two,three,four,five,six,seven,eight,nine,zero,dot,plus,minus,multiply,division,ans,clear;
TextField tf1;
int num1;
int num2;
int res;
int check;

public Calc_button ()
{
c1.setTitle("Calculator");
c1.setSize (360, 238);
c1.setResizable(false);
c1.setLocationRelativeTo(null);
c1.setLayout(null);

tf1 = new TextField();
tf1.setBounds(10,10,285,30);

one = new JButton ("1");
one.setBounds (10,50, 85, 30);
one.addActionListener (this);

two = new JButton ("2");
two.setBounds (105 ,50 ,85, 30);
two.addActionListener (this);

three = new JButton ("3");
three.setBounds (200,50,95, 30);
three.addActionListener (this);

four = new JButton ("4");
four.setBounds (10,90, 85, 30);
four.addActionListener (this);

five = new JButton ("5");
five.setBounds (105,90, 85, 30);
five.addActionListener (this);

six = new JButton ("6");
six.setBounds (200,90, 95, 30);
six.addActionListener (this);

seven = new JButton ("7");
seven.setBounds (10,130, 85, 30);
seven.addActionListener (this);

eight = new JButton ("8");
eight.setBounds (105,130, 85, 30);
eight.addActionListener (this);

nine = new JButton ("9");
nine.setBounds (200,130, 95, 30);
nine.addActionListener (this);

dot = new JButton (".");
dot.setBounds (10,170, 85, 30);
dot.addActionListener (this);


zero = new JButton ("0");
zero.setBounds (105,170, 85, 30);
zero.addActionListener (this);

clear = new JButton ("AC");
clear.setBounds (300,10,50, 30);
clear.addActionListener (this);

plus = new JButton ("+");
plus.setBounds (300,50,50, 30);
plus.addActionListener (this);

minus = new JButton ("-");
minus.setBounds (300,90,50, 30);
minus.addActionListener (this);

multiply = new JButton ("*");
multiply.setBounds (300,130,50, 30);
multiply.addActionListener (this);

division = new JButton ("/");
division.setBounds (300,170,50, 30);
division.addActionListener (this);

ans = new JButton ("=");
ans.setBounds (200,170,95, 30);
ans.addActionListener (this);

c1.add(tf1);
c1.add(one);
c1.add(two);
c1.add(three);
c1.add(four);
c1.add(five);
c1.add(six);
c1.add(seven);
c1.add(eight);
c1.add(nine);
c1.add(zero);
c1.add(dot);
c1.add(plus);
c1.add(minus);
c1.add(multiply);
c1.add(division);
c1.add(ans);
c1.add(clear);

c1.setVisible (true);
}

@Override
public void actionPerformed(ActionEvent e) {
String d1,n;
if(e.getSource()==one)
{
d1=tf1.getText();
n=d1+"1";
tf1.setText(n);
}
if(e.getSource()==two)
{
d1=tf1.getText();
n=d1+"2";
tf1.setText(n);
}
if(e.getSource()==three)
{
d1=tf1.getText();
n=d1+"3";
tf1.setText(n);
}
if(e.getSource()==four)
{
d1=tf1.getText();
n=d1+"4";
tf1.setText(n);
}
if(e.getSource()==five)
{
d1=tf1.getText();
n=d1+"5";
tf1.setText(n);
}
if(e.getSource()==six)
{
d1=tf1.getText();
n=d1+"6";
tf1.setText(n);
}
if(e.getSource()==seven)
{
d1=tf1.getText();
n=d1+"7";
tf1.setText(n);
}
if(e.getSource()==eight)
{
d1=tf1.getText();
n=d1+"8";
tf1.setText(n);
}
if(e.getSource()==nine)
{
d1=tf1.getText();
n=d1+"9";
tf1.setText(n);
}
if(e.getSource()==zero)
{
d1=tf1.getText();
n=d1+"0";
tf1.setText(n);
}
if(e.getSource()==plus)
{
try{
num1=Integer.parseInt(tf1.getText());
}catch(NumberFormatException f){
tf1.setText("Invalid Format");
return;
}
n="";
tf1.setText(n);
check=1;
}
if(e.getSource()==minus)
{
try{
num1=Integer.parseInt(tf1.getText());
}catch(NumberFormatException f){
tf1.setText("Enter number first");
return;
}
n="";
tf1.setText(n);
check=2;
}
if(e.getSource()==multiply)
{
try{
num1=Integer.parseInt(tf1.getText());
}catch(NumberFormatException f){
tf1.setText("Enter number first");
return;
}
n="";
tf1.setText(n);
check=3;
}
if(e.getSource()==division)
{
try{
num1=Integer.parseInt(tf1.getText());
}catch(NumberFormatException f){
tf1.setText("Enter number first");
return;
}
n="";
tf1.setText(n);
check=4;
}
if(e.getSource()==ans)
{
try{
num2=Integer.parseInt(tf1.getText());
}catch(Exception f){
tf1.setText("Enter number first");
return;
}
if(check==1)
{
res=num1+num2;
}
if(check==2)
{
res=num1-num2;
}
if(check==3)
{
res=num1*num2;
}
if(check==4)
{
res=num1/num2;
}
tf1.setText(res+"");
}
if(e.getSource()==clear)
{
num1=0;
num2=0;
check=0;
n="";
tf1.setText(n);
}
}

public static void main(String args[])
  {
Calc_button obj =new Calc_button();
c1.setVisible(true);
   }

}