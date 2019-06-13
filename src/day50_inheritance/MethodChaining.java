package day50_inheritance;

public class MethodChaining {
	public static void main(String[] args) {
		
		methodA();//Step 1
		//step 7
	}
	
	public static void methodA() {
		methodB();//Step 2
		System.out.println("A called");//Step 6
	}
	
    public static void methodB() {
    	
		System.out.println("B called");//Step3
		methodC();//Step4
	}
    
    public static void methodC() {
    	
		System.out.println("C called");//Step 5
		//methodB(); recursion of methods is not allowed
	}
	
	
	

}
