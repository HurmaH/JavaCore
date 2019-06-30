package SundayAssessment;

public class Repl4_1 {
	public static void main(String[] args) {
		//isSort([2,3,5,4,9]);
	}
	 
	public static boolean isSort(int[] nums) {
	   for (int i=0; i<nums.length-1; i++) {
		   if (nums[i]>nums[i+1]) {
			   return false;
		   }
	   }
	   return true;
	   
	}

}
