package lab_programs;

import java.util.Scanner;

class Animal{
	Scanner sc=new Scanner(System.in);
	int legs;
	Animal(int legs)
	{
		this.legs=legs;
	}
	void walk()
	{
		if(legs==0)
			System.out.println("Fish has no legs");
		else
			System.out.println("This animal walk by "+legs+" legs.");
	}
	void eat() {
	}
}
interface pet{
	String getName();
	void setName(String name);
	void play();
}
class Fish extends Animal implements pet {

	Fish(int legs) {
		super(legs);
	}

	@Override
	public String getName() {
		return sc.next();
	}

	@Override
	public void setName(String name) {
		System.out.println("This fish's name is "+name);
	}

	@Override
	public void play() {
		
	}

	@Override
	void eat() {
		System.out.println("Fish eat plants");
	}
	
}
class Cat extends Animal implements pet{

	Cat(int legs) {
		super(legs);
	}

	@Override
	public String getName() {
		return sc.next();
	}

	@Override
	public void setName(String name) {
		System.out.println("This cat's name is "+name);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		System.out.println("Cat eat fishes");
	}
	
}
class Spider extends Animal{

	Spider(int legs) {
		super(legs);
	}

	@Override
	void eat() {
		System.out.println("Spider eat insects");
		
	}
	
}
public class interface_inheritance {
	public static void main(String[] args) {
		String Fish_Name,Cat_Name;
		Fish fish=new Fish(0);
		Cat cat=new Cat(4);
		Spider spider=new Spider(8);
		System.out.print("Enter the name of the fish: ");
		Fish_Name=fish.getName();
		System.out.print("Enter the name of the cat: ");
		Cat_Name=cat.getName();
		System.out.println("\nFISH");
		fish.setName(Fish_Name);
		fish.eat();
		fish.walk();
		System.out.println("\nCAT");
		cat.setName(Cat_Name);
		cat.eat();
		cat.walk();
		System.out.println("\nSPIDER");
		spider.eat();
		spider.walk();
	}
}
