package day38_MethodOverloading;

import java.util.ArrayList;

public class ArrayListPractice {//do not name class with name ArrayList, Scan
	public static void main(String[] args) {
		
		ArrayList <String> myList = new ArrayList <>();
		
		myList.add("Zuccini");
        myList.add("cucumber");
        myList.add("cabbage");
        myList.add("watermelon");
        myList.add("BlueBerry");
        myList.add("Apple");
        myList.add("Bananas");
        myList.add("Milk");
        System.out.println(myList);
        
        //getting count/size
        System.out.println("Size of the Arraylist: "+myList.size());
        //getting single items
        System.out.println("Getting item by index :"+myList.get(5) );
        
        //Update an Item
        myList.set(0, "Chocolate");
        
        //insert an item
        myList.add(1, "Ice Cream");
        
        //check an item exists in the list
        boolean containsMilk = myList.contains("Milk");//case matters
        System.out.println("Contains milk? "+containsMilk);
        System.out.println("Contains milk? "+myList.contains("milk"));
        
        //check location/index of certain items
        int indexOfCabbage = myList.indexOf("cabbage");
        
     // remove item using remove
        myList.remove(4);
        System.out.println(myList);
        
        myList.remove("BlueBerry");//as BlueBerry exist will not do anything
        System.out.println(myList);
        
     // when using remove(object) version of the method 
        // if we dont have the item it remain the same
          myList.remove("KIWI");
          System.out.println(myList);
          // index has to be within range or it will throw Exception
          //myList.remove(100);
          //System.out.println(myList);
          
        //checking list is emty or not
        System.out.println("checking the list is empty or not : "+myList.isEmpty());
        
        //printing all items inside the ArrayList
        for (int i=0; i<myList.size(); i++) {
        	System.out.print(myList.get(i)+" -");
        }
        System.out.println();
        
        for (String each : myList) {
        	System.out.print(each+" -");
        }
        System.out.println();
        
          
        //deleting all from the list
        myList.clear();
        System.out.println(myList);
        
        
        
	}

}
