package Mohanaeswar;

import java.util.*;
	
	public class MultiLevel
	{
	public static void main(String args[])
	{
	Result r = new Result();
	r.get1();
	r.get2();
	r.put();
	}
	}
	class Student
	{
	  String name;
	  int rollno;
	  Scanner s=new Scanner(System.in);
	  void get1()
	{
	  System.out.print("Enter the Name: ");
	  name=s.nextLine();
	  
	  System.out.print("Enter the Roll Number: ");
	    rollno=Integer.parseInt(s.nextLine());
	    }
	}
	  class Mark extends Student
	    {
	    int marks[]=new int[3];
	    void get2()
	    {
	    System.out.print("Enter the Marks in 3 Subjects: ");
	    for(int i=0;i<3;i++)
	    marks[i]=Integer.parseInt(s.nextLine());
	    }
	    }
	  class Result extends Mark
	    {
	    String result;
	    int total;
	    void put()
	    {
	      total= marks[0]+marks[1]+marks[2];
	      if(marks[0]<35||marks[1]<35||marks[2]<35)
	      result="You are Failed";
	    else
	      result="You are Passed";
	  System.out.println("NAME: "+name);
	  System.out.println("ROLL NUMBER: "+rollno);
	  System.out.println("MARK 1: "+marks[0]);
	  System.out.println("MARK 2: "+ marks[1]);
	  System.out.println("MARK 3: "+ marks[2]);
	  System.out.println("TOTAL: "+total);
	  System.out.println("RESULT: "+result);
	}
	}
	



