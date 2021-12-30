package lab_programs;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		x=sc.nextInt();
		System.out.println("The number you entered is "+x);
		sc.close();
	}

}