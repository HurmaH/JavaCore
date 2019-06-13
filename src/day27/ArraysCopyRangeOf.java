package day27;

import java.util.Arrays;

public class ArraysCopyRangeOf {
	public static void main(String[] args) {
		
		String [] heroes = {"MomOf5", "Shrek", "Elsa", "Wonder Woman", 
	             "Cinderella", "Aquaman"};
		
		String [] copyOf1to3 = Arrays.copyOfRange(heroes, 1, 3);
		System.out.println(Arrays.toString(copyOf1to3));
		
		String [] copyOfWtoA = Arrays.copyOfRange(heroes, 3, 6);
		System.out.println(Arrays.toString(copyOfWtoA));
		
		String [] copyOfWto10 = Arrays.copyOfRange(heroes, 3, 10);
		System.out.println(Arrays.toString(copyOfWto10));
		
	}

}
