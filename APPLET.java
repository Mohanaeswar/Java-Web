import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class APPLET extends Applet implements ActionListener
{
    TextField t;
    Button b1,b2,b3,b4,b5,b6;
    String op,option;
    int n1,n2;
public void init()
{
    t=new TextField(13);
    b1=new Button("+");
    b2=new Button("-");
    b3=new Button("*");
    b4=new Button("/");
    b5=new Button("=");
    b6=new Button("CLS");
    add(t);
    add(b1); add(b2); add(b3);  add(b4); add(b5);  add(b6);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
    op=ae.getActionCommand();
    if(op.equals("CLS"))
    {
        t.setText("");
        t.requestFocus();
    }
    else if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))
    {
        option=op;
        n1=Integer.parseInt(t.getText());
        t.setText("");
        t.requestFocus();
    }
    else if(op.equals("="))
    {
            n2=Integer.parseInt(t.getText());
        if(option.equals("+"))
             t.setText(Integer.toString(n1+n2));
        if(option.equals("-"))
             t.setText(Integer.toString(n1+n2));
        if(option.equals("*"))
            t.setText(Integer.toString(n1*n2));
        if(option.equals("/"))
           t.setText(Integer.toString(n1/n2));
      }
     }
}
