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


