package day19_WhileLoop;

import java.util.Scanner;

public class LoopingCharsLoweCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String str = "abc2";
		
		//how to check string start with a-z
		
		char zChar = 'z';
		int zInt = (char) zChar;
		System.out.println(zInt);
		
		char firstChar =str.charAt(0);
		System.out.println('z'<'a');
		
		System.out.println("Please enter a char:");
		if ('z'>=firstChar && firstChar >= 'a') {
			System.out.println("lower case a-z");
		}else {
			System.out.println("not lower case a-z");
		}
		
	}

}
