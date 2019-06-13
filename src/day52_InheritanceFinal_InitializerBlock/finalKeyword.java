package day52_InheritanceFinal_InitializerBlock;
/*
 * final: value cannot be modified
 *         applicable to variables, methods, class
 *         
 *         variable: cannot re-assign its value
 *                   instance variables MUST be initialized before use:
 *                   static: initialized in static field
 *                   instance: initialized in nitializer block or constructor
 *                   
 *         class    : cannot be modified
 *         method    :cannot be overriden
 *                    can be overloaded
 */
public class finalKeyword {
	
	public static void main(String[] args) {
		final int a=9;
		//a=10;
	}

	//ways to initialize final field:
	
	final  int b;
	final static double price;
	final static String str;
	final boolean happy;
	final static int age;
	//1 way inside initilizer block instance fields
	{  
		b=19; 
		//price=2.5;
	}
	
	//2 way inside static block static fields
	static {
		str="Hi";
		price=2.50;
		age =18;
	}
	
	public finalKeyword() {
		happy=true;
		//age = 18; --> initialized in static only
	}
	
}

final class data {  //this class cannot be inherited but can be child class
	
	public final void method1 () { } // cannot be overriden but can be overloaded
	
	final public void method1(int a) { } //---> overloaded method, public final can be witched
}
