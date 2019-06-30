package day62_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked_Unchecked_Exception {
	public static void main(String[] args) {
		System.out.println("Beginning ");
		//Checked exceptions
		//we are required to handle at compile time
		//or it will not even
		try {
			
			System.out.println("DOING SOME IO INTENSIVE ACTION ");
			System.out.println("READING FILE");
			
			throw new FileNotFoundException();
		  //throw new IOException(); //could be throws IOException { in main line
		 // throw new Exception();
		 // Exception is super type of IOException and can not be caught in this catch block
			
		}catch (IOException e) {
			 // IOException e =  new Exception(); not possible
			System.out.println("Caught the fish !!!");
		}
		
		System.out.println("ENDING ");
	    // We are not required to handle unchecked exception at compile time 
	    // BUT If a exception object created , can not find any catch block 
	    // that can contain this exception object , it will still throw the exception 
	    // to the console 
	    
	    throw new RuntimeException() ; 
	    // System.out.println(  10/2 );
	    
	    
		
		
	}

}
