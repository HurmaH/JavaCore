package StringBuilder;

import java.util.ArrayList;

public class class2 {

	public static void methodA() {
		int z=100;
		
	}
	public  void methodB() {
			
		}
}

abstract class class3{
	abstract void method1(int a);
	abstract int method1(double a);
	
	
}

class day01 {

	public static void main(String[] args) {
			class2.methodA();
			new class2().methodB();
			
			int[] arr=new int[3];
			ArrayList<Integer> list= new ArrayList<>();
					list.add( 1 );// Auotoboxing
			
			ArrayList<ArrayList<Integer>>  list2 = new ArrayList<ArrayList<Integer>>();
						list2.add( list );
						
			int num1=10;
			//		num1.toString();
			//	num1 =null;
			
			Integer num2 =10;
			num2.toString();
			num2 = null;
			
		/*
		  
		  1. How do you combine two Strings?
					we use Conacte methods to combine two Strings
			
		  
		  2. What’s the differences between StringBuffer and StringBuilder? What’s
		  synchronization?
		  			
		  			StringBuilder & StringBuffer both are mutable version of sequences of character
		  			StringBuffer is Thread-safe: all methods are synchronized
		  					disadvantages of synchronized: 
		  								1. slower
		  								2. performance problems
		  
		  
		  3. Tell me the differences between void and non-void methods
		  			void methods: cannot return any value;
		  			non-void methods: MUST return a value, the returning value needs to match with return-type		  		
		 			return types: void, all primitives, class, object,...
		 
		 4. Can you explain what is 'public static void' ?
		 			public is access modifier, it's visible to world
		 			static:  any feature that's static belongs to the class, we can call it through class name.
		 			void: does not return any value
		 			
		  
		  5. Briefly explain the differences between Array and ArrayList
		  				1. Array's size is fixed, ArrayList' size is dynamic
		  				2. Array supports primitives. ArrayList does not.
		  				3. Array can be muli-dimensional
		  							  			
		  
		  6. What are the primitives and wrapper classes in java? Their differences
		  			differences: 
		  					1. primitives have default value, wrapper class' default values are null.
		  					2. wrapper class have methods.
		  					3. null can be initialized to wrapper class
		  			
		  		default valus of primitives: byte, short, int, long ==> 0
		  									 float, double ==> 0.0
		  									 char ==> empty
		  									 boolean ==> false;
		  		default value of all wrapper class: null
		  
		 7. Explain me the method overloading and method overriding? 
		 		Return type of	overloaded method should be same or not? 
		 		Can you overload and override the constant methods?
		 		
		 		override methods: only instance methods can be override ( not final, not private)
		 						  needs to be override in sub class
		 						  access modifier needs to be same or more visible, @override
		 						  return type needs to be same
		 		
		 		overload methods: any methods can be overload
		 							can be overload in same class.
		 							return type does not have to be same
		 							
		 			
		 		final methods can be overload, cannot be override
		 						  
		  
		  
		  8. differences between instance variable, class variables and local
		  variables?
		  				instance variable:  belongs to the object, can have specifier and access modfiers 
		  				class variables (static): belongs to the class, can have specifier and access modiffiers
		  				local variable: declared within the blocks or methods can not have specifier and access modiffiers
		  		
		 
		 9. what’s an instance method ? What is static method?
		 			instance methods: belongs to the object
		 			static methods: belongs to the class, can be called through class name.
		 			
		 
		 10. what’s constructor? Declaration ?
		 		declaration:  constructor can have:  AM className(parameters)
		 		special method, execution of constructor depends on the creation of obj
		  			
		 
		 11. inner class VS outer class 
		 			1. Outer class be static? No
		 			 2. Can inner class	be static? Yes
		 			 3. Can you create an object from the inner class? 
		 			 		non static inner class' object cannot be created in static methods
		 			 	
		 			 4. can we have main method in inner class ? Yes
		 
		 12. what are the blocks in java that you have used in your framework?
		 			instance block, static block, finally block
		  
		 13. difference between final and finally?
		 			final is specifier
		 			finally is a block, must be decalred with try&catch
		 
		 14. What is toString method in java.
		 			it's a methods used for converting object to String.
		  
		 15. Did you use Encapsulation in your framework? How ? What’s the befits of
		 using encapsulation?
		 
		  
		  Your assignment: 
		  1. Create a return method that can remove duplicated values from an Integer ArrayList. Do not use Set interfaces.
		  2. Create a method that can divide two numbers without using division operators and Math class.
		  
		  
		 */
			
			
			Integer n1 = new Integer("125");  // valueOf
			Integer n2 = new Integer("125");  // valueOf
			
			System.out.println(n1 == n2);
			
			int n3= 125;
			int n4 =125;
					System.out.println(n3 == n4);

				
	}
	
	public static void method1() {
		return ;
	}
	
	public static int method2() {
		return 10;
	}
	
	// StringBuilder:
	public void append(StringBuilder str) {
		
	}
	
	// Stringbuffer:
	public synchronized void append(StringBuffer str) {
		
	}
	
	
	public static void divide(int num1, int num2) {
		System.out.println(num1/num2);
	}

}
