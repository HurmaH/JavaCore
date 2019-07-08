package day64_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class performanceCompare {
	
public static void main(String[] args) {
		 
		
		List<String> lst1 = new ArrayList<>();
		List<String> lst2 = new LinkedList<>();
		
	      long startTime1 = System.currentTimeMillis();

	      for (int i = 0; i < 1000000; i++) {
	         lst1.add("Test");
	      }
	      long stopTime1 = System.currentTimeMillis();
	      long elapsedTime1 = stopTime1 - startTime1;
	      System.out.println("Miliseconds to add 1million elements with ArrayList:"+  elapsedTime1);		
		
	      startTime1 = System.currentTimeMillis();
	      for (int i=lst1.size()-1; i>=0; i--) {
	    	  lst1.remove(i);
	      }
	      stopTime1 = System.currentTimeMillis();
	      elapsedTime1=stopTime1 - startTime1;
	      System.out.println("Miliseconds to remove 1million elements with ArrayList:"+  elapsedTime1);		
			
	      
	      long startTime2 = System.currentTimeMillis();
	      for (int i = 0; i < 1000000; i++) {
	         lst2.add("Test");
	      }
	      long stopTime2 = System.currentTimeMillis();
	      long elapsedTime2 = stopTime2 - startTime2;
	      System.out.println("Miliseconds to add 1million elements with LinkedList:"+  elapsedTime2);
	      
	      startTime2 = System.currentTimeMillis();
	      for (int i=lst2.size()-1; i>=0; i--) {
	    	  lst2.remove(i);
	      }
	      stopTime2 = System.currentTimeMillis();
	      elapsedTime2=stopTime2 - startTime2;
	      System.out.println("Miliseconds to remove 1million elements with ArrayList:"+  elapsedTime2);		
			
	

}


}
