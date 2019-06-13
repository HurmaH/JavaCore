package day25NestedLoopArray;
import java.util.Arrays;

public class day25_NestedLoopArray {
	public static void main(String[] args) {
		
		int [] nums = new int [50];
		for (int i=1; i<=50; i++) {
			nums[i-1]=i;
		}
		
		System.out.println(Arrays.toString(nums));
		
		//0-100 numbers assign even numbers to array
       	//nums[0] = 0;
		//nums[1] = 2;
		//nums[2] = 4
		int count=0;
		int [] nums2 = new int [50];
		 for (int i=0; i<100; i++) {
			 if (i%2==0) {
				 nums2[count]=i;
				 count++;
			 }
		 } 
		System.out.println(Arrays.toString(nums2));
		
		/*
		 * for (int i=0; i<=49; i++) {
		 * nums2[i] = i*2;
		 * }
		 */
		
	}
}
