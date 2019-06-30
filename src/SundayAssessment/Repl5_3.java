package SundayAssessment;

public class Repl5_3 {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int[] sums = rowSums(a);
		for (int sum : sums)
			System.out.println(sum);
		// this should print 4 6 11 3
	}

	public static int[] rowSums(int[][] nums) {
		int [] newArr = new int [nums.length];
		
		for (int row=0; row<nums.length; row++) {
			int sum =0;
			for(int col =0; col<nums[row].length; col++) {
				sum += nums[row][col];
			}
			
			newArr[row]=sum;
		}
		return newArr;
		

	}

}
