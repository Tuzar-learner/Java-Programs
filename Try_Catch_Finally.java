package lab_programs;

import java.util.Scanner;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		String ans = "y";
		Scanner sc=new Scanner(System.in);
		while(ans.equals("y"))
		{
		try{
			int Num1,Num2,div;
			System.out.print("\nEnter a:");
			Num1=sc.nextInt();
			System.out.print("Enter b:");
			Num2=sc.nextInt();
			div = Num1/Num2;
			System.out.println("Result : "+ div);
			}
		catch(ArithmeticException a){
			System.out.println("Exception Thrown : " + a);
			}
		finally {
			System.out.println("End of Operation");
			System.out.print("Do you want to continue(y/n): ");
			ans=sc.next();
			}
		}
	}
}
			