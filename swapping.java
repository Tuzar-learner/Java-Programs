package lab_programs;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		System.out.println("x=");
		x = sc.nextInt();
		System.out.println("y=");
		y = sc.nextInt();
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping: ");
		System.out.println("x="+x+"   "+"y="+y);
		sc.close();
	}

}
