package lab_programs;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		String Word,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word: ");
		Word=sc.next();
		for(int i=0;i<Word.length();i++)
			rev=rev+Word.charAt(Word.length()-1-i);
		System.out.println("The reversed word is: "+rev);
		sc.close();
	}
}
