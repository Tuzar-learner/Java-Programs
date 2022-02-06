package lab_programs;

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[40][40];
		int r1,r2,c1,c2,i,j,k;
		Scanner sc=new Scanner(System.in);                                                        
		System.out.println("Enter the row and column "
				+ "of the first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the row and column of the second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();   
		if(r2!=c1)
		{
			System.out.println("The matrix is incompactiable");
			return;
		}
		System.out.println("Enter "+(r1*c1)+" elements of the first matrix");
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Enter "+(r2*c2)+" elements of the second matrix");
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				b[i][j]=sc.nextInt();
		for(i=0;i<r1;i++)
			for(j=0;j<c2;j++)
				for(k=0;k<r2;k++)
					c[i][j]+=a[i][k]*b[k][j];
		System.out.println("\nMultiplication result of "
				+ "two matrices is: ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.print("\n");
		}
		
	}
}
