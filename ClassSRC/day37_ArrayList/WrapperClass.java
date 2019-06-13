package day37_ArrayList;

public class WrapperClass {
	public static void main(String[] args) {
		Byte b = new Byte ((byte)123);
		printByteValue((byte)12);
		
		//upcasting/type widening
		//10 is int, 10---> 10L and stored inside long variable
		long lval =10;
		
		//autoboxing
		//10L will become new Long (10L) as object and assigned to lRef
		Long lRef =(long)10;
		
		//Compiler cannot AutoBox and cast at same time
		//10 --> 10L by type widening/upcasting, 10L AutoBoxed
		Long lRef2 = 10L; //Long lRef = 10;will give compile error
		
		Double d = 3.14; //Double d = 3; will not autobox
		
		// compiler can not turn int 3 into Double object in one step 
	    // And compiler only willing to take one step so it does not work 
	    
	    // STEP 1 : 3 ---> 3.0d    upcasting 
	    // STEP 2 : 3.0d --> new Double(3.0d);  // autoboxing
	    // BIG BAD 
	    // Double badD = 3; 
		
		//
		
		
	}
	
	public static void printByteValue(byte b) {
		System.out.println(b);
	}

}
