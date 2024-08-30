import java.io.*;
import java.applet.*;
import java.awt.*;
public class JavaApplication1 extends Applet 
{
    public void init()
    {
        setForeground(Color.red);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g)
    {
    g.drawString("DIFFERENT SHAPES",400,50);
    g.drawString("********************",400,60);
    g.drawString("1.LINE",125,90);
    g.drawLine(150,100,250,100);
    g.drawString("2.RECTANGLE",125,125);
    g.drawRect(150,150,65,150);
    g.drawString("3.ROUND RECTANGLE",125,355);
    g.drawRoundRect(150,395,70,40,10,20);
    g.drawString("4.CIRCLE",125,460);   
    g.drawOval(150,505,50,50); 
    g.drawString("5.ARC",125,580);
    g.drawArc(125,630,90,80,50,70);
    }
  }
