package day52_InheritanceFinal_InitializerBlock;
/*
 * Instance block:  initializing variables
 *                  execution depends on the creation of the object
 *                  belongs to object
 * 
 * Static Block  :  initializing class variables
 *                  executes as soon as class loaded
 *                  belongs to class 
 *                  
 * EXECUTION ORDER: static block ---> instance block ---> constructor
 */
public class InitializerBlock {
	
	{
		System.out.println("Instance Block 1");
	}
	
	{
		System.out.println("Instance Block 2");
	}
	
	static {
		System.out.println("Static block 1"); 
	}
	
	static {
		System.out.println("Static block 2"); 
	}
	
	public InitializerBlock() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		InitializerBlock obj1 = new InitializerBlock();
		
		InitializerBlock obj2 = new InitializerBlock();
		
	}

}
