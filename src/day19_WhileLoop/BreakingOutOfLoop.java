package day19_WhileLoop;

import java.util.Scanner;

public class BreakingOutOfLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//ask user to enter a word
		//keep asking if its not correct
		// but stop asking if user try  3 times
		
		//break;
		int x = 10;
		while (x<100) {
			System.out.println(x++);
			break;
		}
		System.out.println("END");
		
		int count=0;
//		while();
	}

}
