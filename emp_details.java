package lab_programs;
import java.util.Scanner;
class Employee1{
	Scanner sc=new Scanner(System.in);
	String Name;
	String Address;
	int age;
	int Ph_No;
	float Salary;
	void Get_Detail() {
        Name = sc.next();
        System.out.print("Enter Address: ");
        Address = sc.next();
		System.out.print("Enter Age: ");
        age = sc.nextInt();
		System.out.print("Enter Phone Number: ");
        Ph_No = sc.nextInt();
		System.out.print("Enter Salary: ");
        Salary = sc.nextInt();
    }
	void print_Sal()
	{
		System.out.println("Salary: "+Salary);
	}
}

class Officer extends Employee1{
	String  Specialization;
	public void Get_Detail_Officer() {
		System.out.print("\nEnter the Officer's Name: ");
		Get_Detail();
		System.out.print("Enter Specializaton: ");
		Specialization = sc.next();
	}
	public void Disp_Off_Details() {
		System.out.println("\nOfficer's Name: "+Name);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+Ph_No);
		System.out.println("Specialization: "+Specialization);
		print_Sal();
	}
}
class Manager extends Employee1{
	String  Degree;
	public void Get_Detail_Manager() {
		System.out.print("\nEnter the Manager's Name: ");
		Get_Detail();
		System.out.print("Enter Degree: ");
		Degree = sc.next();
	}
	void Disp_Man_Details() {
		System.out.println("\nManager's Name: "+Name);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+Ph_No);
		System.out.println("Degree: "+Degree);
		print_Sal();
	}
}
public class emp_details {
	public static void main(String[] args) {
	Officer Of = new Officer();
	Manager man = new Manager();
	Of.Get_Detail_Officer();
	man.Get_Detail_Manager();
	System.out.println("\nOfficer Details: ");
	Of.Disp_Off_Details();
	System.out.println("\nManager Details: ");
	man.Disp_Man_Details();
	}
	
}
