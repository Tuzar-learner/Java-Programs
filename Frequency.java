package lab_programs;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		String Word;
		char c;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		Word=sc.next();
		System.out.println("Enter a character to find its occurences: ");
		c=sc.next().charAt(0);
		for(int i=0;i<Word.length();i++)
			if(c==Word.charAt(i))
				count++;
		System.out.println("Frequency of the given character is "+count);
		sc.close();
	}
}