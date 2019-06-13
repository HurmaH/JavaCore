package day38_MethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreationInOneShot {
	public static void main(String[] args) {
/*Arrays.asList(var arg) can be used to add items while object is being created
Limitations:
1.The variable type must be a LIST, because method return List not ArrayList
2. it will generate an unmodifiable List
cannot add or remove item - UnsupportedOperationException
*/
		List <Integer> list = Arrays.asList(3,5,7,8,9,2);
		
		System.out.println(list);
		
		list.set(0, 100);
		System.out.println(list);
		
//		list.add(100);
//		list.remove(0);
		
		/*
		 * Since we cannot add or remove item from above list
		 * we want to copy everything from the list
		 * into the new list that we can modify
		 */
		
		ArrayList <Integer> myCoolList = new ArrayList <>(list);
		myCoolList.add(100);                  //primitive
		myCoolList.remove(Integer.valueOf(3));//Wrapper
		System.out.println(myCoolList);
		
		
		//shorter way:
		//instead below:
		List <String> JLA = Arrays.asList("Superman", "BAtman", "Wonder Woman");
		ArrayList <String> JLAcopy = 
				new ArrayList<>(Arrays.asList("Superman", "BAtman", "Wonder Woman"));
		System.out.println(JLAcopy);
		
		JLAcopy.add("Flashh");
		JLAcopy.add("Somebody");
		JLAcopy.remove("BAtman");
		
		
	}

}
