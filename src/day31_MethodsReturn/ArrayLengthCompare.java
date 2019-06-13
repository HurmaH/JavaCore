package day31_MethodsReturn;

import java.util.Arrays;

public class ArrayLengthCompare {
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		int [] array2 = {1,2};
		reportBiggerArray (array1,array2 );
		
		reportBiggerArray (new int [] {1,2,3}, new int[] {1,2});
	}
	
	public static void reportBiggerArray (int []arr1, int[]arr2) {
		if (arr1.length>arr2.length) {
			System.out.println("First array is bigger: "+Arrays.toString(arr1));
		}else {
			System.out.println("Second array is bigger: "+Arrays.toString(arr2));
		}
	}

}
