import DRJ.Emp;
import java.io.*;

public class EmpDetails
{ 
  public static void main(String args[])throws IOException
  {
    int a1=0,i,j,n=0,choice;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Emp[] a=new Emp[10];
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
    a[i]=new Emp();
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