package day30_Methods;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		printUsersName ();
		printUsersName ();
		
	}
	
	public static void printUsersName () {
	    Scanner scan = new Scanner (System.in);
		System.out.println("Please enter name");
		
		String name = scan.next();
		System.out.println("You entered :"+name);	
	}
	

}
