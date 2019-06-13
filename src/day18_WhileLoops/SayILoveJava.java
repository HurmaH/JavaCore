package day18_WhileLoops;

import java.util.Scanner;

public class SayILoveJava {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String theAnswer = "" ;
		
		while(!theAnswer.equalsIgnoreCase("yes")) {
			System.out.println("Do you love Java ?");
			theAnswer = scan.next();
		}
		
		System.out.println("Finally, correct answer!");
	}

}
