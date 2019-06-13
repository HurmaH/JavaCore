package day28_MultiDimensionalArray;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		//ARRAY object must be sorted before using this method
		
		int [] nums = { 1, 5, 6,3, 8, 9};
		
		int index = Arrays.binarySearch(nums, 5);// gives unexpected result
		System.out.println("Location of 5"+index);
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int index2 = Arrays.binarySearch(nums, 5);// gives expected result
		System.out.println("Location of 5: "+index);
		
		int index8 = Arrays.binarySearch(nums, 8);// gives expected result
		System.out.println("Location of 8: "+index8);
		
		//Summary
		System.out.println(Arrays.binarySearch(nums, 3));//1
		System.out.println(Arrays.binarySearch(nums, 9));//5
		System.out.println(Arrays.binarySearch(nums, 4));//-3, if it was in the array it would be 3rd item
		System.out.println(Arrays.binarySearch(nums, 7));//-5  if it was in the array it would be 5th item
		System.out.println(Arrays.binarySearch(nums, -5));//-7
	}

}
