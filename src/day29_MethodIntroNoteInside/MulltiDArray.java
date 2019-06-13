package day29_MethodIntroNoteInside;

import java.util.Arrays;

public class MulltiDArray {
	public static void main(String[] args) {
		
		/*
		 * Array :
		 *       is an object to store miltiple element of same type
		 *       
		 *       Multi D Array :
		 *       Array object that store multiple array object
		 *       of same type
		 */
		
		int [] nums1 = {1, 45, 32, 10};
		int [] nums2 = {2, 5, 31};
		
		int [] numsOfNum [] = new int [2] [];
		System.out.println(Arrays.deepToString(numsOfNum));
		
		numsOfNum [0] =nums1;
		numsOfNum [1] =nums2;
		System.out.println(Arrays.deepToString(numsOfNum));
	}

}
