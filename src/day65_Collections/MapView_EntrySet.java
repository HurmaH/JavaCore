package day65_Collections;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapView_EntrySet {
	// Set<Map.Entry<K, V>> entrySet();
	public static void main(String[] args) {

		Map<String, Double> priceMap = new HashMap<>();

		priceMap.put("Cucumber", 4.12);
		priceMap.put("Potato", 3.02);
		priceMap.put("Tomato", 7.1);
		priceMap.put("Orange", 1.2);
		priceMap.put("Corn", 0.99);
		priceMap.put("Tomato", 3.99);
		
		System.out.println(priceMap);
		
		Set<String> names = new HashSet<>();
		names.add("Hurmik");
		//Iterator <String> iter =names.iterator();
		
		Set<   Entry<String, Double>    > myEntry = priceMap.entrySet(); 
	    
	    for (Entry<String, Double> entry : myEntry) {
	      
	      System.out.println("entry  : " + entry);
	      System.out.println("entry.getKey() : " +  entry.getKey()  );
	      System.out.println("entry.getValue() : " +  entry.getValue()  );
	      
	      //update everything that more than 2$ to 0.55
	      if(entry.getValue()>2.0) {
	    	  entry.setValue(0.55);
	      }

	    }
	    
	    System.out.println(myEntry);
	}

}
