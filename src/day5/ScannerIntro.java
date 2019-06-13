package day5;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {

		//Create a Scanner object
		Scanner userInput = new Scanner(System.in);
		
		//ask user questions
		System.out.println("Enter your fisrt name please : ");
		
		//store user input
		
		//next() method will read one word
		
		
		String name = userInput.next();
		
		System.out.println("Enter your second name please : ");
		//next() method will read one whole line
		String name2 = userInput.next();
		
		System.out.println("Your first and second names are: "+name+", "+name2);
		
		userInput.close();
		

	}

}
