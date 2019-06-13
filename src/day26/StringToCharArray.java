package day26;

import java.util.Arrays;

public class StringToCharArray {
	public static void main(String[] args) {
		
		String str = "Spartan";
		
		//1. Char array using for loop
		int len = str.length();
		char [] myChars = new char [len];
		for (int i=0; i<myChars.length; i++) {
			myChars[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(myChars));
		
		//2. to Char Array method is a method form String
		//   and it will take no external data when being called
		//   and it will return character array that have each char of String object
		char [] myChar2 = str.toCharArray();
		System.out.println(Arrays.toString(myChar2));
		
		
	}

}
