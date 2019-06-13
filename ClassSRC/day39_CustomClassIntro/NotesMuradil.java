package day39_CustomClassIntro;

public class NotesMuradil {
	//Class and Object
/*
 * foundations of programming
 * 4 principles that make language OOP (Object Oriented Language)
 * 
 * 1. Encapsulation
 * 2. Inheritance
 * 3. Abstraction
 * 4. Polymorphism
 * 
 */

	/*
	 * public class House {}
	 * 
	 * House house1 = new House ();// object can be created from empty class
	 * House  : class , data type of house1 variable
	 * house1 : variable of type House,  that is holding a House object, reference variable
	 * 
	 * String name = "John";
	 * String : class, data type
	 * name   : variable of type String, String object
	 * "John" : value of name object
	 * 
	 * int  i : 12;
	 * int    : primitive data type
	 * i      : primitive variable of int data type
	 * 12     : value of primitive variable i
	 */
	
	//LOCAL VS INSTANCE VARIABLES
	/*
	 * Before creating custom classes, all the variable that we used were local variables:
	 * Local Variables:
	 * 					a variable that is DECLARED inside method body.
	 * 					It's scope is limited to that method/loop/if statements
	 * 
	 * Instance Variables:
	 * 					  They are DECLARED within the class and outside any method.
	 * 					  And serve as properties of the class/objects.
	 * 					  It's scope is now whole class, they can be used in different methods
	 *                    Ex: String type; 
	                          String address;
	                          int bedroom; 
	                          int year;
	 */
	
	//CREATING ARRAY FROM CUSTOM CLASS
	/*
	 * int [] nums = new int[4];
	 * String [] names = new String [4];
	 * 
	 * House [] houses = new House [4];  //like below
	 * houses [0] = houese1; //House object should be here
	 * house [1] = house2;
	 * house [2] = house3;
	 * 
	 *PRINTING each object's type and address in House array
	 *
	 *for (House h: houses) { //for  ( dataType variableName : collectionName)
	 *     System.out.println (h.type + "=>"+h.address);
	 *}
	 //REGULAR FOR LOOP
	 *for (int i=0; i<houses.length; i++) { 
	 *     System.out.println (houses[i].type + "=>"+houses[i].address);
	 *}
	 */
	
	//Creating ARRAYLIST of objects
	/*
	 * ArrayList <Integer> numList = new ArrayList <>();
	 * 
	 * ArrayList <House> housesList = new ArrayList <>();
	 * housesList.add(house1);
	 * housesList.add(house2);
	 * housesList.add(house3);
	 * housesList.add(house4);
	 * 
	 * //print  {year and Address} of each houses objects in Arraylist 
	 * if year is between 2006 and 2016
	   
	   for (House h: housesList) {
			int y = h.year;
			if (y>=2006 && y<=2016) {
				System.out.println(y + " | "+h.address);
			}
		}
	 */
	
	//Creating ARRAYLIST from ARRAY
	/*
	 * ArrayList <House> housesList2 = new ArrayList <>(Arrays.asList(houses));
	 * List <House> houseList3 = Arrays.asList(houses); //fix size arrayList
	 * 
	 * 
	 */
	
	//Return House type method 
	/*
	 * public static House buildHouse (String kind; String place; int rooms; int year) {
	 *   House newHouse = new House ();
	 *   newHouse.type  = kind;
	 *   newHouse.address = place;
	 *   newHouse.bedroom = rooms;
	 *   newHouse.year = year;
	 *   
	 *   return newHouse;
	 * }
	 */
	
}
