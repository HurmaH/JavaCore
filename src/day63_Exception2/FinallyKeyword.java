package day63_Exception2;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		 // HOW CAN WE MAKE SURE PROGRAM END GRACEFULLY --
	    // THE EXCEPTION OBJECT MUST BE CAUGHT BY A CATCH BLOCK 
	    // EVENTUALLY TO END OR CONTINUE YOUR PROGRAM GRACEFULLY
	    

		// Objective: run certain code whether the exception occured or not
		System.out.println("START ");
		try {
			System.out.println("Try block ");
			// This is the only time that finally does not get 
			//to execute because JVM shutdown:
		   //System.exit(0);
		   throw new RuntimeException();

		} catch (Exception e) {
			System.out.println("caught");

		} finally {
			System.out.println("This code run no matter we have exception or not");
		}
		System.out.println("End ");
		
		
		//When try block is not able to catch the exception 
		//it is not able to execute rest code
		try {
			System.out.println("Try block ");
			// This is the only time that finally does not get 
			//to execute because JVM shutdown:
		   //System.exit(0);
		   throw new RuntimeException();

		} catch (ArithmeticException e) {
			System.out.println("caught");

		} finally {
			System.out.println("This code run no matter we have exception or not");
		}

		System.out.println("End ");//does not execute
		

	}

}
