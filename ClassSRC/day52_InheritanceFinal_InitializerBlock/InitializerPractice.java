package day52_InheritanceFinal_InitializerBlock;

public class InitializerPractice {
	
	//instance variables to initialize instance block used
	int a;
	String b;
	boolean c;
	double d;
	
	//static variables can be initialized in instance block
	static int a1;
	static String b1;
	
	static {
		//a=2;
	}
	
	{
		a=30;
		b="Cybertek";
		c=10>9;
		d=100_11;
		//a1=12;
		//b1 = "Security";
	}
	
	static {
		a1=12;
		b1 = "Security";
	}
	
	public static void main(String[] args) {
		
//		InitializerPractice obj = new InitializerPractice();
//		
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);
//		
		System.out.println(a1+" "+b1); //if no object is created it will run default if it is initialized inside instance block
		
		
	}

}
