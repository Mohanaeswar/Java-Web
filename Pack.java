package Lib;
import java.io.*;
public class Pack
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String empname;
   int empno,bp;
   double da,hra,pf,gp,np;
   public void enter()throws IOException
   {
    System.out.println("\nEnter the Employee Name: ");
    empname=br.readLine(); 
    System.out.println("Enter the Employee Number: ");
    empno=Integer.parseInt(br.readLine());
    System.out.println("Enter the Basic Salary of the Employee: ");
    bp=Integer.parseInt(br.readLine());
    da=(bp*25)/100;
    hra=(bp*15)/100;
    gp=bp+da+hra;
    pf=(gp*10)/100;
np=gp-pf;
 System.out.println("\n\t\tDetails are Submitted...!!! ");
   }
public void show()
   {
   System.out.println("\nEmployee Name: "+empname);
   System.out.println("Employee NO: "+empno);
   System.out.println("Basic Salary: "+bp);
   System.out.println("DA: "+da);
   System.out.println("HRA: "+hra);
   System.out.println("PF: "+pf);
   System.out.println("Gross Pay: "+gp);
   System.out.println("Net Pay: "+np);
   }
}

import Lib.*;
import java.io.*;
public class EmpDetails
{ 
  public static void main(String args[])throws IOException
  {
    int a1=0,i,j,n=0,choice;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    emp[] a=new emp[10];
System.out.println("\n\t\t\tEMPLOYEE DETAILS");
   System.out.println("\t\t***************************");
    while(true)
   {
   System.out.println("\n\t1.Enter \n\t2.Display \n\t3.Exit");
  System.out.println("\nEnter Your Choice: ");
  choice=Integer.parseInt(br.readLine());
  switch(choice)
   {
    case 1:
   {
   System.out.println("Enter the Number of Employee Details: ");
   n=Integer.parseInt(br.readLine());
   for(i=a1,j=0;j<n;j++,i++)
   { 
    a[i]=new emp();
    a[i].enter();
   }
  a1+=n;
  break;
  }
case 2:
     {
       if(a1>0)
          {
 for(i=0;i<a1;i++)
       {

 System.out.println("\n\nEmployee Details "+(i+1)+":");
        a[i].show();
          }
       }
       else
           System.out.println("NO DETAILS ARE ENTERED...!!!");
       break;
     }
case 3:
    System.exit(0);    
default:
    System.out.println("INVALID INPUT...!!!");
     }
   }
 }
}
