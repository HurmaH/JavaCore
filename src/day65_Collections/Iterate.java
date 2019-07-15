package day65_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {

		Collection<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(9);
		nums.add(12);
		nums.add(23);
		nums.add(15);
		nums.add(29);

		// creating iterator instance by calling iterator() method
		System.out.println(nums);
		Iterator<Integer> myIter = nums.iterator();

		while (myIter.hasNext()) {
			System.out.println(myIter.next());
//			Integer each = myIter.next();
//			System.out.println(each);

			//if(each>9)
			if (myIter.next() > 9) {
				myIter.remove();
			}

		}
		
		System.out.println(nums);
	}

}
