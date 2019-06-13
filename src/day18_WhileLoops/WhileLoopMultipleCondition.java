package day18_WhileLoops;

import java.util.Scanner;

public class WhileLoopMultipleCondition {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter number:");
		
		int num = scan.nextInt();
		int initial = 1;
		
		while (initial<=num) {
			System.out.print(initial+" ");
			initial++;
		}
		
		System.out.println("THE");
	    System.out.println("END");
	}

}
