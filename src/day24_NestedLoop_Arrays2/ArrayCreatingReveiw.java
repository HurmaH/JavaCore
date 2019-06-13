package day24_NestedLoop_Arrays2;

import java.util.Arrays;

public class ArrayCreatingReveiw {
	public static void main(String[] args) {
		
		/*
		 * Array is an  object can store multiple items of same type
		 */
		//1 way to create Array
		boolean [] bools = new boolean [4];
		bools [0] =false;
		bools [1] =false;
		bools [2] =true;
		bools [3] =false;
		System.out.println(Arrays.toString(bools));
		//2 way 
		int [] nums;
		nums = new int [] {1,2,3,4,5,6};//can be declared and initialized at two lines
		System.out.println(Arrays.toString(nums));
		//3 way
		int [] nums2 = {2,3,4,5,6}; //disadvantege, we cannot declare and initialize in different line
		System.out.println(Arrays.toString(nums2));
		
	}

}
