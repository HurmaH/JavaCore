package SundayAssessment;

public class Repl9_3 {
	
	public static void main(String[] args)
	{
		int[][] a = {
			{1,2,3,4},
			{4,5,6,7},
			{1,3,5,7}
		};
		reduce10(a);
		//print the Array
		for(int[] row : a){
			for(int e : row){
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	public static void reduce10(int[][] nums)
	{
		for(int row =0; row<nums.length; row++){
			for(int col=0; col<nums[row].length; col++){
				nums [row][col] -= 10;
			}

		}
	}

}
