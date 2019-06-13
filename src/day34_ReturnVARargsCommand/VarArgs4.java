package day34_ReturnVARargsCommand;

public class VarArgs4 {
	
	public static void main(String[] args) {
		//varArgs -- is represented in method parameter using
		
//		...can only be used as method parameters
//		it can be used anywhere else
//			
//	    Calling a method that have varArg we directly pass variable number of args
//      you may also pass an array -- (not so common but possible)
		
//      what if we have more than one parameter in methods
		
		
	}
	
	public static void doSomething (String name, int... nums) {
		System.out.println("do something was called");
	}
	
//	will not compile 
//	public static void doSomethingElse (int... nums, String name ) {
//		System.out.println("do something was called");
//	}
	
	

}
