package Mohanaeswar;

import java.util.Scanner;

class sumseries {

	public static void main(String[] args) {
		int num;int sum = 0;
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("Sum of the series till the given number is: "+ sum);
	}

}
