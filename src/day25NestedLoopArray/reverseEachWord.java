package day25NestedLoopArray;

import java.util.Arrays;

public class reverseEachWord {
	public static void main(String[] args) {
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String [] arr = str.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) { //loop through each element of array
			String reversedElement ="";//it is here so that each time it will start with empty string
			
			for (int j=arr[i].length()-1; j>=0; j--) { //loop inside each element
				reversedElement += arr[i].charAt(j)+"";
			}
			
			arr[i]=reversedElement;
			System.out.print(reversedElement+" "); 
		}
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

}
