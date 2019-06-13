package day19_WhileLoop;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner (System.in);
		String sentence = "";
		
		while (!sentence.toLowerCase().contains("java")) {
		System.out.println("Please enter a sentence:");
		sentence = scan.nextLine();
		}
		
		System.out.println("Yaay , sentence contains word \"java\" !");
		
	}
	
	

}
