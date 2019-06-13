package day27;

import java.util.Arrays;

public class ArrayEquality {
	public static void main(String[] args) {
		 int [] arr1 = {1,2,3,65,4};
		 int [] arr2 = {1,2,3,65,4};
		 int [] arr3 = {1,2,4,3,65};
		 
		 System.out.println(arr1==arr2);//2 dog 2 leash
		 System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr2)));
		 
		 //Arrays class has equals method to check whether 2 array
		 //has same content or not
		 boolean sameOrNot = Arrays.equals(arr1, arr2);
		 System.out.println("Compare arr1 to arr2: "+sameOrNot);
		 
		 System.out.println("Compare arr2 to arr3: "+Arrays.equals(arr2, arr3));
		 
		 Arrays.sort(arr2);
		 Arrays.sort(arr3);
		 System.out.println("Compare arr2 to arr3 after sorting: "+Arrays.equals(arr2,arr3));
		 //System.out.println("Compare arr2 to arr3: "+Arrays.equals(Arrays.sort(arr1), Arrays.sort(arr2)));
		
		//printing true or false without equals 
		boolean result =false;
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					result = true;
				}else {
					result = false;
					break;
				}
			}
		}
		 
	
	}

}
