package day38_MethodOverloading;

public class MethodOverloadingWrapper {
	//
	public static void main(String[] args) {
		
		doSomething();
		
		//if method with Integer available, it will be called first! 
		//if not available nex will look for method with int param
		//after that it will call long 
		Integer num = new Integer (100);
		doSomething (num); 
		doSomething( Integer.valueOf(100) );//same as doSomething (num);
     // can we set a Integer variable value to null ? ANSWER YES !!! 
	 // int x= null ; BAD IDEA
	    Integer b = null ; 
	    doSomething(b);
	    doSomething( null );
	    
		//if int param is not available it will first call bigger primitive types
		//it cannot call methods with Wrapper parameter
		doSomething(100);
		doSomething( Integer.parseInt("100") );//same as  doSomething(100);
		
		int val = Integer.parseInt("100");
	    doSomething(val);                      //same as  doSomething(100);
	    
	
	    	    
		doSomething(100L);
		
		doSomething(20d);
	}
	
	public static void doSomething () {
		System.out.println("doSomething()");
	}
	
	public static void doSomething (int x) {
		System.out.println("doSomething(int x)");
	}
	
	public static void doSomething (Integer x) {
		System.out.println("doSomething(Integer x)");
	}
	
	public static void doSomething (long x) {
		System.out.println("doSomething(long x)");
	}
	
	public static void doSomething (double x) {
		System.out.println("doSomething(double x)");
	}

}
