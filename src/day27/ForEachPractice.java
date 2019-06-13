package day27;

import java.util.Scanner;

public class ForEachPractice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a word");
		
		String word = scan.next();
		
		char [] wordChars = word.toCharArray();
		for (char wordChar:wordChars) {
			System.out.print(wordChar+"-");
		}
		
       System.out.println("Enter a sentence");
		
		String sentence = scan.next();
		String [] words = sentence.split(" ");
				
		for (String wrd:words) {
			System.out.print(wrd+", ");
		}
		
		//Optional
		System.out.println("Please enter a sentence");
		String str = scan.nextLine();
		
	}

}
