package day23_NestedLoop_Arrays;

public class NestedLoop {
	public static void main(String[] args) {
		
		//Dry Principle
		// Do Not Repeat Yourself
		
		for (int i=1; i<6; i++) {
			
		}
		
		//Task 2:
		/*
		 * print from 15 - 5 in one line
		 * repeat this 4 times
		 */
		
		for (int j=0; j<=4; j++) {
			System.out.println();
			for (int i=15; i>=5; i--) {
			System.out.print(i+" ");
		    }
		}
	}

}
