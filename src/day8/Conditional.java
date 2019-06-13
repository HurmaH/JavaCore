package day8;

import java.util.Scanner;

public class Conditional {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
//		int score = 59;
		
		System.out.println("Please enter score: ");
		int score = scan.nextInt();

		System.out.println("Current score is "+score);
		/*
		 * if (put some boolean in here) {
		 * 	do some action here if true
		 * }else {
		 *  do something else it false
		 */
		
		if (score>60) {
			System.out.println("You shall pass!");
		}else {
			System.out.println("You shall not pass!");
		}
	}

}
