package day42_CustomClassReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarmUp {
	/*
	 * Task 1 
        Create an ArrayList object and add 5 whole numbers
        try out adding one by one 
        and also try adding in one shot 

        update each number to double of that number  
        1,3,5,6,7 --> 2 6 10 12 14

    reverse this ArrayList using one of the utility method that we learned 
    from Collections class

        OPTIONALLY Reverse this ArrayList not using above method
	 */
	
	public static void main(String[] args) {
		ArrayList <Integer> numList = new ArrayList <> ();
	    numList.add(2); // numList.add (new Integer(6)); autoBoxing
	    numList.add(3);
	    numList.add(12);
	    numList.add(22);
	    numList.add(20);
	    System.out.println("Original: "+numList);
	    
	    //oneshot
	    
	    //1.  Arrays.asList return a fixed size list and return type is List 
	    // so it has to be stored in List variable 
	    List <Integer> nums2 = Arrays.asList(10,2,3,35,20);
	   // creating an ArrayList object with another list object
	    ArrayList<Integer> list3 = new ArrayList<Integer>(nums2) ;
	    
	    //2.  creating an ArrayList object with another list object in one shot
	    ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
	    
	    //3. Collections
	    ArrayList <Integer> nums3 = new ArrayList <>();
	    Collections.addAll(nums3, 1,2,3,4,5);
	    System.out.println(nums3);
	    
	    
	    //double
	    for (int i=0; i<numList.size(); i++) {
	    	numList.set(i,numList.get(i)*2);
	    }
	    System.out.println("Doubled: "+numList);
	    
//REVERSING=========================================================	    
	    
	    //reverse using utility
	    Collections.reverse(numList);
	    System.out.println("Reversed with Collection: "+numList);
	    
	    //reverse without utility
	    //using second ArrayList object
	    ArrayList <Integer> numListRev = new ArrayList <>();
	    for(int i=numList.size()-1; i>=0; i--) {
	    	numListRev.add(numList.get(i));
	    }
	    System.out.println("Second ArrayList object: "+numListRev);
	    
	    //swapping
	    System.out.println("Before Swapping: "+numList);
	    
	    for (int i=0; i<numList.size()/2; i++) {
	    	Integer temp = numList.get(i);
	    	numList.set(i, numList.get(numList.size()-1-i));
	    	numList.set(numList.size()-1-i, temp);
	    }
	    System.out.println("Reverse by swapping: "+numList);
	   
	}
	
	

}
