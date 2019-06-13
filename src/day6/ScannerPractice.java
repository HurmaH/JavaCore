package day6;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		
		int i=10;
		
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		
		//ask questions
		System.out.println("Enter Your mood today :");
		//save user input into String
		String mood = scan.next();
		scan.nextLine();
		
		System.out.println("Enter Your location today :");
		String location = scan.nextLine();
		
		System.out.println("Your mood today is : "+mood);
		System.out.println("Your location today is : "+location);
		
		scan.close();
		
		
	}

}
