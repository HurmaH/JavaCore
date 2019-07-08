package day64_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	// List has two popular implementation 
    // ArrayList , LinkedList
	
	public static void main(String[] args) {
		
		 List<Integer> lst1 = new ArrayList<>(); 
         //lst1 = new LinkedList<>() ;
		 
		 List<Integer> lst2 = new LinkedList<>(); 
		    lst2.add(2) ;   // new Integer(2) ;  
		    lst2.add(5) ; 
		    lst2.add(8) ;
		    lst2.add(1) ;
		    
		    for (int i = 0; i < lst2.size(); i++) {
		        System.out.println(lst2.get(i) + " -  ");
		      }
		      
		      System.out.println(lst2.toString() );
		      
		      lst2.remove(2); 
		      System.out.println(  lst2 );
		      lst2.remove( new Integer(5) );
		      System.out.println(  lst2 );
		      
		      List<Long> lst3 = new LinkedList<>(); 
		      lst3.add(10L) ;   // new Integer(2) ;  
		      lst3.add(5L) ; 
		      lst3.add(8L) ;
		      lst3.add(1L) ;
		      
		      lst3.remove(10L); //new Long(10L)
		      System.out.println(lst3);
	}

}
