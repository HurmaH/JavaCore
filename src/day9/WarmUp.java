package day9;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Math library!");
		System.out.println("Please enter 2 integer");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		if ((num1+num2)>100) {
			System.out.println("You entered great numbers!");
		}else {
			System.out.println("Looks like your sum is less than 100!");
		}
		in.close();
	}

}
