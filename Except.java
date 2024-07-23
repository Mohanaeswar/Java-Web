package Mohanaeswar;

import java.io.*;
class Except
{
public static void main(String args[])throws IOException
{
int a,b,k;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);

System.out.println("\n\t\t EXCEPTION HANDLING");
System.out.println("\t*******************************");

System.out.println("\n\t\t1.Arithmetic Operation");
try
{
System.out.print("Enter a Value: ");
a=Integer.parseInt(br.readLine());
b=10/a;
System.out.println("A: "+a+"\t B: "+b);
}
catch(ArithmeticException e1)
{
System.out.println("Exception: "+e1); 
}
try
{
int z[]=new int[5];
System.out.print("Enter the Index: ");
k=Integer.parseInt(br.readLine());
z[k]=10;
System.out.println("Element 10 is Stored at "+k);
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("Exception: "+e2);
}
System.out.println("\n\t\t3.Array Negative Size");
try
{
System.out.print("Enter the Array Size: ");
k=Integer.parseInt(br.readLine());
int c1[]=new int[k];
System.out.println("k: "+k);
}
catch(NegativeArraySizeException e3)
{
System.out.println("Exception: "+e3); }
System.out.println("\n\t\t4.Number Format");
int x[]=new int[10];
try
{
System.out.print("Enter the Elements: ");
for(int y=0;y<5;y++)
x[y]=Integer.parseInt(br.readLine());
}
catch(NumberFormatException e4)
{
System.out.println("Exception: "+e4);
}
}
}









