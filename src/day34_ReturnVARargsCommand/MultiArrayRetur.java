package day34_ReturnVARargsCommand;

import java.util.Arrays;

public class MultiArrayRetur {
	//main method
	public static void main(String[] args) {
		int [][] nums ={{11,2,3,4},{2,4,5,6,7,8}};
		System.out.println(Arrays.deepToString(nums));
		
		twoDPrinter (nums);
		
		//task 2
		int row =2, col=3;
		int [] [] twoDArr = new int [row][col];
		System.out.println(Arrays.deepToString(twoDArr));
		
		
		
	}
	
	//task1 method
	public static void twoDPrinter (int [][] nums) {
		for (int[] num: nums) {
			for (int n: num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	
	//task2 method
	public static int [][] get2DArray (int row, int col) {
		int [][] num2DArray = new int [row][col];
		
		
		return num2DArray;
	}
	
	

}
