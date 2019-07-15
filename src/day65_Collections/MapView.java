package day65_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapView {
	// SubList , SubSet, HeadSet, TailSet are examples of view we learned so far
	// and it point to original object , any change made will reflect on original
	// object

	// Set<K> keySet();
	// Collection<V> values();
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
		
		// Set<K> keySet();
		Set<String> veggies = priceMap.keySet();
		System.out.println("Set of Key: "+veggies);
		
		for(String veg: veggies) {
			System.out.println(veg+" value is :"+priceMap.get(veg));
		}
		
		// Collection<V> values();
		Collection <Double> allPrices = priceMap.values();
		System.out.println(allPrices);
		
		allPrices.remove("Celery");
		System.out.println(priceMap);
		
		allPrices.remove( 4.12 ); 
	    System.out.println( priceMap );
	}

}
