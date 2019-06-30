package day29_MethodIntroNoteInside;

//public class _1_MethodsNotes {
/* Method : 
 - grouping things together 
 - breaking things apart 

- Scenario : 

	steps 
	1, making internet connection 
	2, navigate to the amazon 
	3, search for items 
	4, add to the cart 
	5, fill up payment info and pay 
	6, receive confirmation in email 
-----------------------------------------
	methods that we know so far : 

	*main method : 
		special method that start and run your program

	*Scanner class methods : 
		next()
		nextX()...

	*String class methods 
		strObject.length() 
		strObject.subString(1,4)
		strObject.charAt(0)

	*Arrays class methods 
		Arrays.toString(arrobject)
		Arrays.sort(arrobject)
-----------------------------------------		

METHOD OBSERVED

	1, method without return value 

		*some methods only take action without returning/generating a new value so we can store 
		example : Arrays.sort(arr)

	2, method with return value 

		*some methods take action and return a value so we can store 
	     example :strObject.length()

	3, method that does not take external data when being called 

		 strObject.length(); 
		 strObject.toUpperCase(); 
		 strObject.toLowerCase(); 
		 strObject.trim(); 
		 scanObject.next();

	4, method that take external data when being called 
		 
		 strObject.charAt(10); 
		 Arrays.sort(arr);
		 strObject.indexOf("horse"); 
		 strObject.subString(1,3);
		 Arrays.copyOfRange(arr,1,4);

	5, some methods need an object so we can call using that object 

		strObject.charAt(10);
		String.charAt(10) WRONG !!
		scanobject.next() ; 

	6, some methods DOES NOT need an object to be called 

		Arrays.sort(arr) ; 
		Arrays.equals(arr1,arr2); 
--------------------------------------------------------

/Method name : release the horse
	     * method that does not take external data
		 * method that does not return any value
		 * method that does not need an object to be called
		 * 
		 * Arrays.toString (arr);
		 * Spartan.releaseTheHorse();
		 * 
		 *public static void:  
		 * public -- to define where it
		 * 
		 * static == non-access modifier ; if defined no object needed to call this
		 * 	
		 * void == method take only action and does not return any value
		 *
-----------------------------------------------------
    calling the method
    printUsersName() ; 
    calling the method
    Utility.printUsersName() ; 
    
    Arrays.sort(arrObject) ; 
    
    
     We can call methods coming from 
     different classes 
     if the class is under same package no import needed
     if the class is under different package import is mandatory
    Spartan.releaseTheHorse();
		 */
/*methods:
	 * reusable code, maintainable code, write once and use it whenever needed
	 * 	
	 * 3 questins to ask while creating a method:
	 * 
	 * does this method needs an object or not whn being called 
	 *  -->> if not we use static key word
	 *  
	 *  does this method take external data or not 
	 *  -->> if it does not we just end method name with empty ()
	 *  -->> if yes put data type and name : parameters separated by comma
	 *  
	 *  does this method return a value after being called
	 *    --> if not use void
	 *    --> if yes put data type of the variable that it return
	 *  -->> if not we use static key word
*/
/// BREAK VS RETURN 
/*
 * break : ---> we can only use it inside switch and loop
 * 
 * return : --> exclusively used to return a value
 *       or terminate method execution  
 * */
//a method that return a value of any type 
// should not have any chance to not return value 
// or it will not even compile 

// you may have many return statement in different execution path 
// buy you may only return one value 

/* return;
 * where we can use it 
 * 
 * method with return type to return a value
 * out of the method
 * 
 * it can be used to get out of any method
 * including method with return type or void method
 * 
 * once the return keyword is reached method stop executing
 * 
 *  break vs return 
 * 
 * break ----> loop + switch 
 * return ---> to return value or terminate method execution 
 * 
 *system.exit --> shut down Java 
 */


/*
 *str.toUpperCase(); 
in the above statement: toUpperCase is a method of String class.

input.nextInt()
.next();
.nextDouble();

System.out.println(message);
println is a method/action. When you use it, it performs some actions.

main method -> JDK starts execution of your code from main method.
======================

Writing custom/our own methods:
=================

Benefit of writing methods, in some languages methods are called functions:
- reusable code
- organize code
- maintainable code
- readable code/simple to read
===================================

Anytime you write a method in Java, it is associated to a class.
You write methods within classes.

Class is template:
can have 2 things:
- data/attributes
- behaviour/methods


================


public static void main(String[] args) {
sayHello(); // calling sayHello method
sayHello();
}

public static void sayHello() {
System.out.println("Hello");
System.out.println("Hi!");
}


We can define our custom methods within a class.
All methods must be written within a class, it cannot be written outside the class.

We can put any number of statements that we want to reuse within the methods. 
Once we write the methods, they do not run unless you call/use them.

When you are calling , you type method name and 
it will go and execute the code within that custom method.


public class Main{
public static void main(String[] args) {
sayHello();
sayBye();
sayBye();
sayBye();
sayBye();
System.out.println("Bye! Have a good day!");
}


public static void sayBye() {
System.out.println("Adios! Tenga buen dia! ");
}

public static void sayHello() {
System.out.println("Hello");
System.out.println("Hi!");
}

}

==================

Part by part analysis of the method definition:
Methods can be different, the below method is
void and does not accept parameters.


public static void sayHello() {
System.out.println("Hello");
}

public -> access modifier that means this method is visible to the world. Can be called from any class in the same project.
public, protected, <default>, private

static -> is a modifier that means it belongs directly to the class and not dependent on object. Method can be called by classname.
Method can be called without creating the object.

Ex:
Arrays.sort(arr) -> sort is a static method and called by using classname 
Scanner input = new Scanner(System.in);
input.nextInt();

void -> means that this method does not return a value.
-> it means when we call this method, it performs some actions
but does not return a value back to us.

sayHello();

public static void sayHello() {
System.out.println("Hello");
}

String str = "java";

int l = str.length();

print l

System.out.println(str.length());

In the example of length() -> the method return a int value.

When method is void, it does not return anything.

VOID == NO RETURN VALUE

We cannot say:
String message = sayHello();
System.out.println ( sayHello() );

-----
public static void sayHello() {
System.out.println("Hello");
}
sayHello -> is a method name. normally we start with lowercase letter then rest is camelCase. it should be meaningful name, and 
it follows same rules of variable naming.

sayHello () -> we need to always put paranthesis, and in this example it is empty but anytime we can pass inputs/arguments/parameters . By declaring variable in it.
==========================

Can static be used with variables?

Yes, but it needs to be outside any method.

========================


public static void sayHelloTo(String name) {
System.out.println("Hello " + name);
}

sayHelloTo(String name) -> it means whenever we call sayHelloTo methods, we need to give Strign value to it. 
String name -> is a method input/arguments/parameter


sayHelloTo(); // will not work , since we defined this method to accept a string value.


sayHelloTo("Nazim"); // this will work, since we are passing String input to the method.
=============================

Summary:

- introduction to custom methods
- purpose and benefits of writing methods
- few keywords overview
- syntax of how to create:
1) VOID methods that does not accept any parameters
2) VOID methods that accept one or more parameters

  
 */

//------------------------------------
/*
 * CUSTOM METHOD CREATION IN JAVA

1. void methods in java

- collection of statements
- group the statements into one block

Logic: 
1. purpose 
ex: charAt() --> giving us the char of a given index
trim() --> getting rid of extra white spaces around the string. 
2. naming
- you should name the short version of purpose of method.

3. dependent information


Rules:
1. method signature
Ex: public static void printLastLetter(String name){
// code here
name
}

public static void myOwnMethod(String s){
printLastLetter(s);
}

variable 'name' is local to printLastLetter method. 
There is no WAY 'name' can go outside of this method.

String s = "James";
int i = s.charAt(0);


--------------------------

psv arrayStringReplace(String[] arr, String target, String r){

if(r.equals("Adam")){
return;
}
}

return; ---> keyword that terminates the method execution.

---------------------------

REturn methods

-> replace 'void' keyword in method signature with datatype that you want to return.

 


public static void method(String [] arr, int i){

}
 */

