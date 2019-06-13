package day26;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		//reverse this array so the value of numbers array
		//will be in the reverse order
		
		int [] numbers = {11, 2, 39, 7, 4, 15};
		int len = numbers.length;
		int lastIdx = len-1;
		for (int i=0; i<len/2; i++) {
			numbers[i]        = numbers[i]+numbers[lastIdx-i];
			numbers[lastIdx-i]= numbers[i]-numbers[lastIdx-i];
			numbers[i]        = numbers[i]-numbers[lastIdx-i];
		}
		
		System.out.println(Arrays.toString(numbers));
		
		
//		int temp = numbers[0];   
//		numbers[0] = numbers[5];// 
//		numbers[5] = temp;
//		
//		temp       = numbers[1];
//		numbers[1] = numbers[4];
//		numbers[4] = temp;
//		
//		temp       = numbers[2];
//		numbers[2] = numbers[3];
//		numbers[3] = temp;
//		
		
		
		
		
		
		/*
		 * Write a program to find count of certain element in array
		 * Write a program to find unique element in array
		 * Eventually combining above two , write a program to find out 
		 * frequency of unique elements in array
		 */
		
		
	}

}
