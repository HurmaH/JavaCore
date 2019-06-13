package day24_NestedLoop_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySçanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int [] arr = new int [5];
		
//	    System.out.println("enter number");
//	    arr[0] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[1] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[2] = scan.nextInt();
		
		for (int i=0; i<arr.length; i++) { //i=1 was tried it gives out of bound on line 19
			System.out.println("Enter number "+(i+1));//
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
		}System.out.println(Arrays.toString(arr));
		
		int minNum = arr[0];//it is better to assign first element rather than 0
		int maxNum = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]<minNum) {
				minNum = arr[i];
			}
			
			if (arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		System.out.println("Minimum value "+ minNum);
		System.out.println("Maximum value "+ maxNum);
		
	}
}
