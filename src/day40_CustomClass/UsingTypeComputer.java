package day40_CustomClass;

import java.util.ArrayList;

public class UsingTypeComputer {
	public static void main(String[] args) {
		
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
	 */
	  //reference variable of Computer 
	  Computer myComputer = new Computer();
	  ArrayList <String> lst = new ArrayList<>();
	  ArrayList <Computer> myComList = new ArrayList<>();
	  myComList.add(myComputer);
	  myComList.add(new Computer () );
	  
	 //Creating Array of comp:
	 String str = new String ("actual result"); //string object
	 String [] strArr = new String[3];          //String array object
	 
	 Computer comp = new Computer ();       //Computer object
	 Computer [] comArr = new Computer [3]; //COmputer Array object
	 
	 printComputer (myComputer);
	 printString (str);
	 
	 System.out.println(getString());
	 System.out.println(getComputer ());//gives hash code without toString
	
	}
	
	//Created a method that accept computer as parameter
	//so when we call this method
	//we will pass computer object as argument
	public static void printComputer (Computer comObject) {
		System.out.println("Computer object");
	}
	
	public static void printString (String strObj) {
		System.out.println(strObj);
	}
	
	//return example
	public static String getString() {
		return "returning String";
	}
	
	//we creted a method that return computer object
	public static Computer getComputer () {
		
		//in order to return computer object
		//first we need to create an object
		Computer iMac = new Computer();
		iMac.OS="MacOS";
		return iMac;      //returned computer object
	}
}
