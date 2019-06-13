package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		//Creating ArrayList
		//way1
		ArrayList <String> list = new ArrayList <>();
		List <String> lst = new ArrayList <>();
		
		//way2
		//creating arraylist with all the items from another list
		//putting argument inside paranthesis
	    ArrayList <String> list2 = new ArrayList <> (list);
	    
	    //way3, in one shot
	    List <Integer> list3 = Arrays.asList(3,5,7,8,9,2);
	    
		
		//add method --> Adding items
		list.add("Mekan");
		list.add("Mishka");
		list.add("Hurmik");
		list.add("Romashka");
		list.add("Juyje");
		System.out.println(list);
		
		//get method --> Getting single items we use
		String str = list.get(4);
		System.out.println("item 5: "+str);
		System.out.println("item 1: "+list.get(0));
		
		//for loop to print each item:
		for(int i=0; i<list.size(); i++) {
			System.out.println("item "+(i+1)+": "+list.get(i));
		}
		
		//size() method --> getting count/length of the items inside
		int count = list.size();
		System.out.println(count);
		
		//add(index, value) --> insert, when insert the index shift
		//list.add(10, "Turshi");//index should be in a range or it will give Exception
		list.add(1, "Alma"); 
		System.out.println(list);
		
		// set(index, newValue) --> Updating a value inside ArrayList item 
	    list.set(2, "Moton") ; 
	    System.out.println(list);
	
	    //.indexOf(Value)
	    System.out.println("index of Moton: "+list.indexOf("Moton"));
	    
	    // .clear ()  -->  deleting everything from the list 
	    list.clear();
	    System.out.println(list);
		
	    //contains (value):
	    System.out.println(list.contains("hey"));//boolean value
	    
	    //isEmpty --->boolean
	    boolean isItEmptyOrNot = list.isEmpty(); //true, boolean
	    System.out.println(isItEmptyOrNot);
		
	    
		 // remove(ItemValue) --> removing items from arrayList 
	    // remove(index)     -->
		ArrayList <Integer> numList = new ArrayList <>();
		
		
		//
		
	}

}
