package Mohanaeswar;

import java.io.*;

public class Strman {
	  public static void main(String args[])throws IOException
	  {
	    InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(ir);
	    System.out.println("\t\tSTRING MANIPULATION");
	    System.out.println("\t\t****************************");
	    System.out.print("Enter a String: ");
	    String name=br.readLine();
	    System.out.println("The String is: "+name);
	    System.out.println("The Length is: "+name.length());
	    System.out.println("The Character at Index 4 is: "+name.charAt(4));
	    System.out.println("The Upper Case of name is: "+name.toUpperCase());
	    System.out.println("The SubString from(2,6) is: "+name.substring(2,6));
	    System.out.println("After Replacing 'a' to 'z': "+name.replace('a','z'));
	  }
}
