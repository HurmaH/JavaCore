package day38_MethodOverloading;

import java.util.*;

public class CollectionsUtilityClass {
	//Collections is a class under java.util package
	//to perform common collection object related operation
	/* 
	 * sort method from ArrayList except an object called Comparator we d
	 * However even we don't know this type of object
	 * we do know 
	 */
	public static void main(String[] args) {
		ArrayList <String> name = new ArrayList <String>();
	
	    name.add("Yusuf");
	    name.add("Yunus");
	    name.add("Kerim");
	    name.add("Maya");
	    name.add("Yasemin");
	    name.add("Sofiya");
	    
	    System.out.println(name);
	    
	    //sorting ArrayList using sort method of Collections class
	    Collections.sort(name);
	    System.out.println(name);
	    
	    //looking for the index of an item in the sorted list
	    int kerimLocation = Collections.binarySearch(name, "Kerim");
	    System.out.println("Kerim index: "+kerimLocation);
	    
	    int mekanLocation = Collections.binarySearch(name, "mekan");//lower case comes after Upper Case
	    System.out.println("Mekan index: "+mekanLocation);
	    
	    //reversing 
	    Collections.reverse(name);
	    System.out.println(name);
	    
	    //shuffle
	    Collections.shuffle(name);
	    System.out.println(name);
	    
	    
	    
	}
	

}
