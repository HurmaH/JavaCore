package day62_Exception;

public class ExceptionIntro {
	public static void main(String[] args) {
		
		//Exceptions are object
		
		//ArrayIndexOutOfBoundsException
		int [] nums = {1,3,5};
		//System.out.println(nums[99]);
		
		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException(); 	     System.out.println(aib);
     // throw keyword --->> is used to throw exception manually 
    //  throw aib ; 
	       
	       
	     // TASK 1  
	       
	     // try to devide a number by 0 to see ArithmaticException 
	     // and comment out that code and generate same exception using throw keyword 
	    //int i = 5/0; 
		//System.out.println( i ); //ArithmeticException
	    // There is another constructor in every exception that accept String 
	     // you can use it to provide more information about the cause 
	     
//	     ArithmeticException ar = new ArithmeticException("DO NOT DIVIDE BY 0"); 
//	     throw ar ; 
	    
	    
	     
	     
	     
	     //Task 2 
	     //try NullPointerException
//	     String str = null;
//	     System.out.println(str.length());
	     
		
		
	}

}
