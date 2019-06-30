package day62_Exception;

import java.util.Scanner;

public class TryCAtch2 {
	public static void main(String[] args) {
		// Try catch block is used wrap up a piece of code that aniticipated to throw certain type of exception 
	    // and catch the exception that happen if it happen 
	    // and and either try to recover from it or just report it 
	    // so the program does not shutdown and continue to execute 
		
		System.out.println("Beginning of the code");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter string with at least 2 character : ");
		
		String input = scan.nextLine();
		System.out.println("enter index");
		int i = scan.nextInt();
		
		
		//access i th caracter
		try {
			System.out.println("try BEGIN");
			System.out.println("Your char at index "+i+ " is "+input.charAt(i));//this line might give excption out of boundary
			System.out.println("try END");
		}catch (NullPointerException npe) {
	        //NullPointerException npe = new StringIndexOutOfBoundsException() ;
	         System.out.println("Enter correct index");
		} 
		    	    
		    System.out.println( "Ending of the code " );
		    
	}

}
