package day18_WhileLoops;

import java.util.Scanner;

public class GiveMeSum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int sum = 0;
		int countNum=1;
		int scanNum;
		System.out.println("Until what number you want to add:");
		scanNum = scan.nextInt();
		
		while (countNum <= scanNum ) {
			sum += scanNum;
			countNum++;
		}
		
		System.out.println("Current sum ="+sum);
	}

}
