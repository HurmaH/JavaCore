package day33_ReturnMethod;

import java.util.Arrays;

public class ReturningMultipValue {
	public static void main(String[] args) {
		
		int [] myArray = giveMeAnArray ();
		System.out.println(Arrays.toString(myArray));
		
		//different way to invoke the method
		System.out.println(Arrays.toString(giveMeAnArray()));
	}
	
	//this method have no parameter
	//return int array object as returned value
	public static int [] giveMeAnArray () {
		System.out.println("Action");
		int[] arr = new int[] {1,2,3};
		return arr;
	}

}
