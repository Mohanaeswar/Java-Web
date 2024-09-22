package DRJ;
import java.io.*;

public class Emp {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String empname;
    int empno, bp;
    double da, hra, pf, gp, np;

    public void enter() throws IOException {
        System.out.println("\nEnter the Employee Name: ");
        empname = br.readLine();
        System.out.println("Enter the Employee Number: ");
        empno = Integer.parseInt(br.readLine());
        System.out.println("Enter the Basic Salary of the Employee: ");
        bp = Integer.parseInt(br.readLine());
        da = (bp * 25) / 100;
        hra = (bp * 15) / 100;
        gp = bp + da + hra;
        pf = (gp * 10) / 100;
        np = gp - pf;
        System.out.println("\n\t\tDetails are Submitted...!!! ");
    }

    public void show() {
        System.out.println("\nEmployee Name: " + empname);
        System.out.println("Employee NO: " + empno);
        System.out.println("Basic Salary: " + bp);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Pay: " + gp);
        System.out.println("Net Pay: " + np);
    }
}
