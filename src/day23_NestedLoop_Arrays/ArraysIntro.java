package day23_NestedLoop_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int i5 = 50;
		
		//we declared in array var
		//and we assign and int arra
		//that has capacity of 5
		int [] nums = new int [5];
		//System.out.println(nums); will print hashcode
		
		//Assigning value to array
		nums [0] = 10;
		nums [1] = 20;
		nums [2] = 30;
		nums [3] = 40;
		nums [4] = 50;
		System.out.println(nums[0]);
		
		//task 2: 
		//create an array of double with size 4
		
		double [] numDuble = new double [4];
		
		numDuble[0] = 5.5;
		numDuble[1] = 6.5;
		numDuble[2] = 7.5;
		numDuble[3] = 8.5;
		
		System.out.println(Arrays.toString(numDuble));
		
		System.out.print("[");
		for (int i=0; i<numDuble.length; i++) {
			System.out.print( numDuble[i]+", ");
		}
		System.out.print("]");
		
		//Task3:
		/*
		 * 
		 */
		//boolean array
		boolean [] bools = new boolean [5];
		bools [0] = true;
		bools [1] = false;
		bools [2] = true;
		bools [3] = false;
		bools [4] = true;
		System.out.println("Printing boolean array:");
		System.out.println(Arrays.toString(bools));
		
		//short varaible declare
		short [] shortNum;
		
		//String array
		String [] str = new String [5];
		str [0] = "hi";
		str [1] = "how";
		str [2] = "are";
		str [3] = "you";
		str [4] = "bye";
		
		
		//Scanner array variable
		Scanner [] manyScans = new Scanner [3];
		
		
	}

}
