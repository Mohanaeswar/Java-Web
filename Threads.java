package Mohanaeswar;

public class Threads
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
}
}
class A extends Thread
{
public void run()
{ 
for(int i=1;i<=5;i++)
{
  if(i==1)  
   yield();
   System.out.println("From Thread A: i="+i);
}
System.out.println("Exit From A");
}

}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
 if(j==1)
 stop();
System.out.println("From Thread B: j="+j); 
}
System.out.println("Exit From B");
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
System.out.println("From Thread C: k="+k);
System.out.println("Exit From C");
}
}

