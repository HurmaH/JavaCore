package day6;

import java.util.Scanner;

public class LunchTimeOrCoding {

	public static void main(String[] args) {
		//creating scanner object
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Please enter Your previous weight in kg: ");
		double weight1 = inp.nextDouble();
		
		System.out.println("Please enter Your current weight in kg: ");
		double weight2 = inp.nextDouble();
		
		if (weight2<weight1) {
			System.out.println("You have lost "+(weight1-weight2)+"kg, You can have lunch !" );
		}else if (weight1<weight2) {
			System.out.println("You have gained " +(weight2-weight1)+"kg, You need to continue coding !" );
		}else {
			System.out.println("You have not lost and gained weight! You can either have lunch or continue coding :)");
		}
		
		inp.close();

	}

}
