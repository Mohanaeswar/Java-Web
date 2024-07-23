package Mohanaeswar;

import java.io.*;
public class InterFace
{
  public static void main(String args[])throws IOException
  {
    float r1,r2,c1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Rectangle rect=new Rectangle();
    Circle cr=new Circle();
    Area ar;
   System.out.println("\nEnter the Length and Breadth of the Rectangle: ");
    r1=Float.parseFloat(br.readLine());
    r2=Float.parseFloat(br.readLine());
     ar=rect;
    System.out.println("Area of Rectangle: "+ar.compute(r1,r2));
    System.out.println("\nEnter the Radius of the Circle: ");
    c1=Float.parseFloat(br.readLine());
    ar=cr;
    System.out.println("Area of Circle: "+ar.compute(c1,0));
  }
}

interface Area
{
  static final float pi=3.14159f;
  float compute(float x,float y);
}
class Rectangle implements Area 
{
  public float compute(float x,float y)
  {
    return(x*y);
  }
}
class Circle implements Area 
{
  public float compute(float x,float y)
  {
    return(pi*x*x);
  }
}

