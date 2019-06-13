package day35_MethodOverloading;

public class OverloadingAmbigious{
	public static void main(String[] args) {
	
		//add(10, 12); //do we have exact match, not trying to upcast, second method will make it ambigious 
	    //add(10L, 12L); //Long can be upcasted to double, but long cannot downcast to int
	    add(10d, (byte)12); // will invoke
	    
	    //prevent ambigious method call error
	    add(300D, 12); //will call 1 method
	    add(300, 12D); //will call 2 method
	}
	
	//1
	public static void add(double a, int b) {
		System.out.println("add (double a, int b)");
	}
	
	//2
	public static void add(int a, double b) {
		System.out.println("add (int a, double b)");
	}

}
