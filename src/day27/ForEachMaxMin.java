package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachMaxMin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 5 numbers:");
		int [] nums = new int [5];
		
//		for (int eachNum : nums) {
//			eachNum = scan.nextInt();
//		}
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(nums));
		
		//get Sum, Max, Min
		int sum=0;
		int max = nums[0];
		int min = nums[0];
		
		for (int eachNum : nums) {
			sum += eachNum;
			
			if (eachNum>max) { max = eachNum;}
			
			if (eachNum<min) { min = eachNum;}
		}
		System.out.println("Sum: "+sum);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
		//by sorting
		Arrays.sort(nums);
		System.out.println("Max: "+nums[nums.length-1]);
		System.out.println("Min: "+nums[0]);
	}

}
