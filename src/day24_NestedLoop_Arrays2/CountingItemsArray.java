package day24_NestedLoop_Arrays2;

import java.util.Arrays;

public class CountingItemsArray {
	public static void main(String[] args) {
		
		//Task
		 int [] nums = {1, 55, 7, 898, 9, 55};
		 
		 //print to see what is inside
		 System.out.println(Arrays.toString(nums));
		 
		//find the count of numbers more than 100;
		 int count=0;
		 for (int i=0; i<nums.length; i++) {
			 if (nums[i]>100) {
				 count++;
				 System.out.println("Number more than 100: "+nums[i]);
			 }
		 }
		 System.out.println(count);
	}

}
