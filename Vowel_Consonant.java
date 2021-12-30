package lab_programs;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter");
		c=sc.next().charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				System.out.println(c+" is a vowel");
			else
				System.out.println(c+" is a consonant");
			sc.close();
	}

}
