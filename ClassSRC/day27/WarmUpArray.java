package day27;

import java.util.Scanner;

public class WarmUpArray {
	public static void main(String[] args) {
		
		/*Task1 : 
	      create an array of int with 5 items , 
	      return true if all items are more than 10
	      return false if not
		*/
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("PLease enter 5 numbers:");
		int [] nums = new int [5];
		boolean result=true;
		for (int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt(); 
		}
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]<=10) {
				result = false;
				break;
			}
		}
		

	}

}
