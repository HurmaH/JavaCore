package day19_WhileLoop;

import java.util.Scanner;

public class LoopingCharNumUpperCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		char oneChar = '9';
		int oneNum = (char) oneChar; //0=48, 9=57
		System.out.println(oneNum);
		
		System.out.println("Please enter a word:");
		String word = scan.next();
		
		if (word.charAt(0)>='0' && word.charAt(0)<='9') {
			System.out.println("First char is a number");
		}else {
			System.out.println("First char is not a number");
		}
		
		if (word.charAt(word.length()-1)>='A' && word.charAt(word.length()-1)<='Z') {
			System.out.println("Last char is UpperCase");
		}else {
			System.out.println("Last char is not UpperCase");
		}
	}

}
