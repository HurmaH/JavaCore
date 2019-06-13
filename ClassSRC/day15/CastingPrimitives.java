package day15;

public class CastingPrimitives {
	public static void main(String[] args) {
		// char , boolean, 
		// byte, short , int , long , float , double
				
		// type conversion -- casting 
				
		//  byte --> int   upcasting / type widening 
		//  this happens implicitly --- by compiler 
				
		byte b = 12 ; 
		int i = b ; 
		//int y = (int)b ;  // explicitly --  by programmer  
				
		//  int --> byte   downcasting / type narrowing 
				
		int a = 20 ; 
		byte c = (byte) a ; 
				
		double d = 12.12 ; 
		int k = (int) d ; 
		//System.out.println(k);
				
		// boolean b = (boolean)10 ; 
		
		// char to int 
		String first = "Francesqua"; 
		char last = first.charAt(first.length()-1);
		char fChar =first.charAt(0);
		System.out.println(""+last+fChar+last);
		
		int lastCharNum = last ; 
		System.out.println(lastCharNum);
		
		int firstCharNum = fChar ; 
		System.out.println(firstCharNum);
				
		char character0 = '0' ;  
		int zeroAsciiNumber = character0 ; 
		System.out.println(zeroAsciiNumber);
				
		char characterA = 'A' ;
		System.out.println(   (int) characterA    );
				
		System.out.println( fChar + lastCharNum );
			
			
				
//				int f2 ='A';
//				
//				System.out.println(f2);
//						System.out.println(f1);
//				System.out.println(first.charAt(0));
//				System.out.println(first.charAt(first.length()-1));
//				System.out.println(first);
				
				
				
				
	}

}
