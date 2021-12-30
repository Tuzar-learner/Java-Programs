package lab_programs;

import java.util.Scanner;

public class swapping_without_temp {
	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("\nAfter swapping (without temp):");
	System.out.println("a=" + a + "  " + "b="+b);
	sc.close();
	}
}