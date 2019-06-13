package day20_DoWhile;

import java.util.Scanner;

public class StoreNumNonNum {
	public static void main(String[] args) {
//Create a program that ask user a sentence (may or may not contain number) 
//and store numerical and non-numerical part separately and 
//print out the results. 
//Also print out the count of the characters from a-z
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter sentence:");
		String sentence = in.nextLine();
		
		int charCount=0;
		String num="";
		String nonNum="";
		int azCount=0;
		
		while (charCount<sentence.length()) {
			
			if (sentence.charAt(charCount)>='0' && sentence.charAt(charCount)<='9') {
				num = num+sentence.charAt(charCount); 
			}else {
				nonNum = nonNum+sentence.charAt(charCount);
			}
			
			if (sentence.charAt(charCount)>='a' && sentence.charAt(charCount)<='z') {
				azCount++;
			}
			
			charCount++;
		}
		
		System.out.println("Numerical: " +num);
		System.out.println("Non Numerical: "+nonNum);
		System.out.println("Count of the characters from a-z: "+azCount);
	}
}
