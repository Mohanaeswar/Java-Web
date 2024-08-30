import java.io.*;
public class File {
  public static void main(String[] args)throws IOException {  
    int d=0;
    FileInputStream fi=null;
    FileOutputStream fo=null;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\t\t\tFILE MANIPULATION");
    System.out.println("\n\t\t\t*************************");
    System.out.println("Enter the Existing File Name: ");
    String s1=br.readLine();
    System.out.println("Enter the New File Name: ");
    String s2=br.readLine();
    try
    {
      byte b[]=new byte[1024];
      fi=new FileInputStream(s1+".txt");
      fo=new FileOutputStream(s2+".txt");
      System.out.println("\nCopying File...");
      while((d=fi.read(b))>0)
        fo.write(b,0,d);
System.out.println("\nFile is Copied...!!!");
    }
    catch(IOException e)
    {
      System.out.println("\nException: "+e);
    }
  }
}
