package day23_NestedLoop_Arrays;

public class CreatingArray2 {
	public static void main(String[] args) {
		//once array is created with a given size
		// it cannot be changed
		
		int[] numbers = new int [2];
		
		//Assigning Value to array
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[0] = 100;//it will change value
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		numbers = new int [4];   //new object is created, now numbers pointing to this object
		System.out.println(numbers[0]);
	}

}
