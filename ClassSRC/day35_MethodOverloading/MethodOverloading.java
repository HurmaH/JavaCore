package day35_MethodOverloading;
//Overloading methods enables you to define the methods with the same name 
//as long as their signatures are different.
/*
 * can i use same method name for different methods ? 
 * YES !!!!!! 
 * That's called method overloading 
 * 
 * Defination : 
 *    reusing the name of the method with different method parameters
 * 
 *  you can have method with different parameter count 
 *  you can have method with different parameter type
 *  or both  
 * 
 * */ 
public class MethodOverloading {
	
	public static void main (String [] args) {
		
		printName();
	    printName("JAVA ");
	    printName("JAVA ", "Spartan");
	    
	    
	    System.out.println();
		
	}
	
	public static void printName () {
		System.out.println("Method Overloading ");
	}
	
	public static void printName (String name) {
		System.out.println("Method Overloading "+name);
	}
	
	public static void printName (String firstName, String lastName) {
		System.out.println("Method Overloading "+firstName+lastName);
	}

}
