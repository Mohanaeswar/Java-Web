package Mohanaeswar;

import java.util.Scanner;

class stars {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
	}

}
