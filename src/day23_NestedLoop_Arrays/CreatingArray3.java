package day23_NestedLoop_Arrays;

public class CreatingArray3 {
	public static void main(String[] args) {
		
		//once array is created with a given size
		//it can not be changed
		
		int [] numbers = new int [2];
		
		//ASSIGNING VALUE to array
		// 2nd way to create an array with predefined items
		
		//dataType [] variableName = new dataType [] {item1, item2, item3, item4}
		
		int [] nums = new int [] {1,3,4,5,8,9,0,4,-2};
		
		//getting size
		int size = nums.length;
		System.out.println(size);
		
		nums[0] = 100; //reassign
		System.out.println(nums[0]);
		System.out.println(nums[size-1]);
		
		
		
		
	}

}
