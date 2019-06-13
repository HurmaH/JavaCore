package day31_MethodsReturn;

public class WarmUp {
/*	 WARM UP TASK 

	    Create few static methods with no return type 
	    with below name and logic
	    
	    1, create a method called countFrom1To10
	    take no parameters 
	    print 1-10 in one line with space
	    
	    2, create a method called countFrom1ToN
	    take 1 int as parameter  
	    print 1-N(number user passed) in one line with space
	    
	    3, create a method called CountDown
	    take 1 int as parameter 
	    and count down till 1 in method body
*/
	public static void main(String[] args) {
		
		countFrom1To10();
		countFrom1To10();
		
		countFrom1ToN(6);
		countFrom1ToN(25);
		
		countDown(20);
		
		
	}
	
	//1.
	public static void countFrom1To10 () {
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//2.
	public static void countFrom1ToN (int num) {
		for (int i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//3.
	public static void countDown (int num) {
		for (int i=num; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}
