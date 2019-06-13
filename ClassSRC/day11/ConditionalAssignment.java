package day11;

import java.util.Scanner;

public class ConditionalAssignment {
	
	public static void main(String[] args) {
		
		// create 2 variable 
	    // score as integer , get the value from scanner
	    // result as String 
	    
	    // write an if statement to check for score 
	    // more than 75 , if yes assign result value to pass
	    // esle assign result value to fail 
	    
	    // print out result value 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter score:");
		int score = scan.nextInt();
		String result;
		
//		if (score>75) {
//			result = "pass";
//		}else {
//			result = "fail";
//		}
		
		//? ternary operator, : colon
		        
		       //is it true?  true : false      
		result = (score>75)? "pass":"fail";
		
		System.out.println(result);
		
		scan.close();
	}

}
