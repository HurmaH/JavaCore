package day39_CustomClassIntro;

import day40_CustomClass.Computer;

public class Notes {
	//properties of the object are defined by 
	//instance variable/field
	String name;
	int age;
	char gender;
	
	//local variables inside main method:
	//local var need to be initialized
	String s = "abc";
	
	/*
	 * Horse:
	 * 		properties : color, age, breed
	 * 		
	 * 		behaviors  : jump, eat, run, kick
	 * 
	 * Person : 
	 *      properties : name, age, gender
	 * 		
	 * 		behaviors  : cook, laugh, run
	 * 
	 */
	
	///createing object from class:
	// Classname  objectName = new Classname();
	//objectName.instanceVar;
	
	//Printing object:
	//System.out.println(objectName);  --->will give hashcode
	
	/*Default values for fields if it is not defined
	 *
	 *any reference type field ---> null
	 *any whole numbers type ---> 0
	 *any fractional numbers type --->0.0
	 *char ---> empty char ascii 
	 *boolean ---> false 
	 * 
	 * instance variables/field get default value 
	 * if it's not specified in template class
	 * 
	 * default values can be changed 
	 * in template class by providing value
	 * in template class itself while declaring the field
	 *  
	 */
	
	  String type2="unknown";
	//public static void eat () {}
			//any non static method is called instance method
			public static void eat () {
				System.out.println("eating with STATIC");
			}
			
	/*
	 * instance variables can be accessed inside methods directly
	 * just like it's a local variable for that method
	 * 
	 * if you are outside class you need and object to access these attributes
	 */
			
		public void takeNote() {
			System.out.println(name+age+gender);//instance variables used without object
		}	
		
		String type;
		public static void returns() {
			
			Computer iMac = new Computer();
		//	System.out.println(type); //we cannot access instance variable outside of instance method
		}

		/*
		 * What we can do when we have a class
		 * 
		 * Create object out of it
		 * 
		 * It will become a type
		 * Create a reference variable Computer iMac
		 * use it method parameter
		 * use it as method return type
		 * use it as a type for ArrayList object
		 * 
		 * reference variable of Computer 
		 * Computer myComputer = new Computer();
		 * ArrayList <String> lst = new ArrayList<>();
		 * ArrayList <Computer> myComList = new ArrayList<>();
		 * myComList.add("iMac");
		 * myComList.add(new Computer () );
		 * 
		 *Creating Array of comp:
		 *String str = new String ("actual result");
		 *String [] strArr = new String[3];
		 *
		 *Computer comp = new Computer (); //Computer object
		 *Computer [] comArr = new Computer [3]; //COmputer Array object
		 * 
		 */
		
		//CLASS:
		/*
		 * it's a blueprint or template for an object
		 * 
		 * we can do:
		 * 1. use as a Type
		 * 2. create object out of it
		 * 3. Create a reference variable
		 * 4. Method parameters
		 * 5. method return type
		 * 6. type for the collection objects : ArrayList
		 * 										Array
		 * 
		 * WHAT WE CAN HAVE INSIDE A CLASS
		 * 
		 * 1. instance variable/field:
		 * 					   - to define properties/attributes/state of object
		 *                     - access in same class any instance method can directly this outside of class
		 *                       create an instance/object to access obj.fieldName 
		 * 
		 * 2. instance method :
		 *                     - add behavior of objects
		 *                     - call method in same class
		 *                     - call method outside of class: 
		 *                       create an instance/object to access obj.methodName(arguments);
		 *                     - to manipulate the attribute | state of object
		 *                     
		 *  3.static method
		 *                     - add behavior to the class
		 *                     - call method different class: ClassName.MethodName(arguments);
		 *                     - same class : any static method can access another static method directly
		 *                       by calling methodName(arguments);
		 *                                  ClassName.methodName(arguments);
		 *                                  ClassName.methodName(arguments); //outside class
		 */
		
		   //what about static and non static - accessing each other? 
		 /*
		  * Static var field
		  * Constructor
		  * instance initilizer block and static initilizer block
		  * 
		  */
		
		

}
