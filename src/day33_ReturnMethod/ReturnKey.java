package day33_ReturnMethod;

import java.util.Scanner;

public class ReturnKey {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		if (num<0) return; //once return keyword is reached method finish
		
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
	}

}
