package Mohanaeswar;

import java.util.Scanner;

class triangle {

	public static void main(String[] args) {
		System.out.println("\tArea and Perimeter of a triangle");
		System.out.print("Enter the Base,Height and third side:");
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int height = s.nextInt();
		int side = s.nextInt();
		System.out.println("Area:"+(0.5*base*height));
		System.out.println("Perimeter:"+(base+height+side));				
	}

}
