package Interview;

public class ArrayPractice2 {
	public static void main(String[] args) {
		
		// create an int array of 5 items and assign values ; 
		int [] nums = new int [] {1,3,4,6,7};
		
		// double the value of 3rd item  : for example 9 --> 18 
		nums [2] = nums[2]*2;
		
		// update the value of 4th item to sum of 1st and 2nd items
        nums [3] = nums[0]+nums[1];
		
        // print them out using the loop 
        for (int i=0; i<nums.length; i++) {
        	System.out.print(nums[i]+" ");
        }
        System.out.println();

		// OPTIONALLY SWAP the value of first and last items 
		int temp = nums[0];
		nums [0] = nums[4];
		nums [4] = nums[0];
		for (int i=0; i<nums.length; i++) {
        	System.out.print(nums[i]+" ");
        }
		System.out.println();
		
		//get the sum of all numbers
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println("Sum of all numbers: "+sum);
		
		//get the max
		int maxNum =0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]>maxNum) {
				maxNum=nums[i];
			}
		}
		System.out.println("Maximum number: "+maxNum);
	}

}
