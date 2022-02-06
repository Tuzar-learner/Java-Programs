package lab_programs;

import java.util.Scanner;

public class Try_Catch_Throw {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			int Num1,Num2,div;
			System.out.print("Enter a:");
			Num1=sc.nextInt();
			System.out.print("Enter b:");
			Num2=sc.nextInt();
			div = Num1/Num2;
			System.out.println("Result : "+ div);
			}
		catch(ArithmeticException a){
			System.out.println("Exception Thrown : " + a);
			}
	}
}
