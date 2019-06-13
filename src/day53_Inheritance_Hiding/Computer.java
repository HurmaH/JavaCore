package day53_Inheritance_Hiding;

public class Computer {                        //1. public final class Computer cannot be inherited 
	
	public final void systemPolicy() {        //2. public final void systemPolicy cannot be overriden, can be overloaded
		System.out.println("Do not change this policy");
	}
	
	//Can OverLoad
	public final void systemPolicy(int i) {        
		System.out.println("Do not change this policy");
	}
	
	public final static void staticSystemPolicy() {   //3. cannot hide final static method
		System.out.println("Do not change this STATIC policy"); 

	}
	

}

class MacBook extends Computer{ 
	
	//@Override --> cannot Override final Method from Computer
//	public final void systemPolicy() { 
//		System.out.println("Do not change this policy");
//	}
	
	//cannot hide final static method
//	public final static void staticSystemPolicy() {
//		System.out.println("Do not change this STATIC policy"); //
//	}
	
}
