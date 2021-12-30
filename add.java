package lab_programs;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
	int x,y,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for a: ");
	x=sc.nextInt();
	System.out.println("Enter the value for b: ");
	y=sc.nextInt();
	sum=x+y;
	System.out.println("\nThe sum of the numbers you entered is "+sum);
	sc.close();
}
}