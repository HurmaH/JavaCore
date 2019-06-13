package day8;

public class MoreLogOperations {
	// Logical and operator &&
    // As long as one operand is false WHOLE THING WILL BE FALSE 
    // ONLY WHEN both operands are true then WHOLE THING WILL BE TRUE 
  
  // Logical or operator ||
    // As long as one operand is TRUE WHOLE THING WILL BE TRUE 
    // ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE 
  
  // Logical not operator !
	public static void main(String[] args) {
		
		System.out.println("result of (true && true) "+(true && true));
		System.out.println("result of (false && true) " +  (false && true)  );
	    System.out.println("result of (true && false) " +  (true && false)  );
	    System.out.println("result of (false && false) " +  (false && false)  );
	    
	    System.out.println("result of (true || true)  " +  (true || true)  );
	    System.out.println("result of (false || true) " +  (false || true)  );
	    System.out.println("result of (true || false) " +  (true || false)  );
	    System.out.println("result of (false || false) " +  (false || false)  );
	    
	    System.out.println("result of !true " + (!true) );
	    System.out.println("result of !false " + (!false) );
	    
	}

}
