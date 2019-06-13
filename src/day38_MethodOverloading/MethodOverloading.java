package day38_MethodOverloading;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		doSomething();
		doSomething(100);
		doSomething(100L);
		
		doSomething(20d);
	}
	
	public static void doSomething () {
		System.out.println("doSomething()");
	}
	
	public static void doSomething (int x) {
		System.out.println("doSomething(int x)");
	}
	
	public static void doSomething (long x) {
		System.out.println("doSomething(long x)");
	}
	
	public static void doSomething (double x) {
		System.out.println("doSomething(double x)");
	}

}
