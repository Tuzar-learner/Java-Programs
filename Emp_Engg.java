package lab_programs;
import java.util.Scanner;
class employee{
	Scanner sc=new Scanner(System.in);
	float emp_salary,PA=0,DA=0;
	void Get_Sal()
	{
		System.out.print("Enter the Basic Salary of the employee: ");
		emp_salary=sc.nextFloat();
		System.out.print("Enter the DA of the employee: ");
		DA=sc.nextFloat();
		System.out.print("Enter the PA of the employee: ");
		PA=sc.nextFloat();
	}
	float Emp_Gross_Salary(){
		return emp_salary+PA+DA;
	}
	}	
class engineer extends employee{
	float engg_salary,engg_PA=0,engg_DA=0;
	void Get_Sal_Engg() {
		engg_salary=2*emp_salary;
		System.out.print("Enter the DA of the engineer: ");
		engg_DA=sc.nextFloat();
		System.out.print("Enter the PA of the engineer: ");
		engg_PA=sc.nextFloat();
	}
	float Engg_Gross_Salary(){
					return engg_salary+engg_PA+engg_DA;
			}
}
public class Emp_Engg {
	public static void main(String[] args) {
		engineer eng=new engineer();
		eng.Get_Sal();
		System.out.print("The Gross Salary of the employee is: ");
		System.out.println(eng.Emp_Gross_Salary());
		eng.Get_Sal_Engg();
		System.out.print("The Gross Salary of the engineer is: ");
		System.out.println(eng.Engg_Gross_Salary());
	} 
}
