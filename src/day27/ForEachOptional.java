package day27;

import java.util.Scanner;

public class ForEachOptional {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str = scan.nextLine();
		String [] words = str.split(" ");
		
		//Optional dash in the middle of
		for (String word : words ) {
			char[] wordChars = word.toCharArray();
			for (char wordChar: wordChars) {
				System.out.print(wordChar+"-");
			}
			System.out.println();
		}
		
		
		//Optional-reverse
		
				
		//reversed words of sentence	
		String reversed;
		for (String word: words) {
			reversed="";
			for (int i=word.length()-1; i>=0; i--) {
				reversed += word.charAt(i)+"";
			}
			System.out.print(reversed+" ");
		}
		
	}

}
