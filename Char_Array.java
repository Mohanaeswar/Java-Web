package Mohanaeswar;

import java.io.*;
public class Char_Array
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,k=0,len,c=0,sp=0,v=0,w=1;
    String s1,s2;
    System.out.println("\n\t\tCHAR ARRAY");
    System.out.println("\t*************************");
    System.out.println("Enter the String: ");
    s1=br.readLine();
    char ch[]=s1.toCharArray();
    System.out.println("The Given String is: ");
    int n=ch.length;
    for(i=0;i<n;i++)
    {
      System.out.println(ch[i]);
      if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
    	  v++;
      else if(ch[i]==' ')
        sp++;
      else
        c++;
    }
    w=sp+1;
    len=ch.length;
    System.out.println("\nConstants: "+c+"\nVowels: "+v+"\nSpaces: "+sp+"\nWords: "+w);
    char c1[]=new char[len];
    for(j=len-1;j>=0;j--)
      c1[k++]=s1.charAt(j);
    s2=new String(c1);
    System.out.println("The Reversed String is: "+s2);
    if(s1.equalsIgnoreCase(s2))
      System.out.println("\nThe Given String "+s2+" is a Palindrome...!!!");
    else
      System.out.println("\nThe Given String "+s2+" is Not a Palindrome...!!!");
    
  }
}
