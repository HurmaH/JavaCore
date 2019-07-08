package Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {
	//hashSet Treeset LinkedHashSet
	public static void main(String[] args) {
		
		HashSet names = new HashSet<>();
		names.add("Hurmik");
		names.add("Mekan");
		names.add("Sofiya");
		names.add("Kerim");
		
		ArrayList <String> names1 = new ArrayList<>(Arrays.asList("Yunus", "Yusuf", "Jeyhun"));
		
		names.addAll(names1);//adding list
		System.out.println(names);
		
		names.addAll(names); //adding itself
		System.out.println(names);
		
		//iterator
		Iterator i = names.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
