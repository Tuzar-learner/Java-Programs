package lab_programs;

import java.util.Scanner;

public class Largest {

	public static void main (String[] args) {
		int num1,num2,num3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if (num1>num2&&num1>num3)
			System.out.println("the greatest is: "+num1);
		else if (num2>num1&&num2>num3)
			System.out.println("the greatest is: "+num2);
		else
			System.out.println("the greatest is: "+num3);		
		sc.close();
	}
}