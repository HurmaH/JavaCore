package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoopModifyItem {
	public static void main(String[] args) {
		
		//for each loop should never to be used to modify array items
		
		int i = 10;
		int j = i;
		j=20;
		System.out.println(i);
		
		int [] arr = {1,2,4,6,3};
		for (int k=0; k<arr.length; k++) {
			int eachItem = arr[k];
			eachItem =20;
		}
		System.out.println(Arrays.toString(arr));
		
		
		for (int eachItem:arr) {
			eachItem =20;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
