package day62_Exception;

import java.util.Scanner;

public class OutOfBounds {
	// write a piece of code that 
    // you anticipate to throw ArrayIndexOutOfBoundsException
    // and put it under try catch block so it does not shutdown when it happen 
    
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter index number");
		int i = scan.nextInt();
		int [] nums = {1,3,4,19};
		
		try {
			System.out.println(nums[i]);
			System.out.println("End of try block");//this line will be skipped if there is exception
		}catch (ArrayIndexOutOfBoundsException aib) { //ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException(); 
			System.out.println("This is catch block message");
			System.out.println("You have entered index out of bounds");
			System.out.println("Just retrning last item:");
			System.out.println(nums[nums.length-1]);
		}
	}

}
