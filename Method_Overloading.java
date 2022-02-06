package lab_programs;

import java.util.Scanner;
class area{
	void calcarea(float r)
	{
			float area=3.14f*r*r;
			System.out.println("The area of the circle"
					+ " with radius "+r+" is: "+area);
		}
		void calcarea(float base,float height)
		{
			float area=base*height*0.5f;
			System.out.println("The area of the triangle "
					+ "with base "+base+", height "+height+" is: "+area);
		}
		void calcarea(int length,int breadth)
		{
			int area=length*breadth;
			System.out.println("The area of the rectangle "
					+ "with length "+length+" and breadth "
					+breadth+" is: "+area);
		}
	}
public class Method_Overloading{

	
	public static void main(String[] args) {
		area a=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of the triangle: ");
		float base=sc.nextFloat();
		System.out.println("Enter the height of the triangle: ");
		float hgt=sc.nextFloat();
		System.out.println("Enter the length of the rectangle: ");
		int len=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle: ");
		int bdh=sc.nextInt();
		System.out.println("Enter the radius of the circle: ");
		float rad=sc.nextFloat();
		a.calcarea(base,hgt);
		a.calcarea(len,bdh);
		a.calcarea(rad);
		sc.close();
	}

}
