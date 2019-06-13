package day10;

import java.util.Scanner;

public class primeMemeber {
	
	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome Amazon shopper");
		System.out.println("Please enter price as double:");
		double price = scan.nextDouble();
		
		System.out.println("Are you prime member? \nIf yes type \"true\", if not type \"false\"");
		String prime = scan.nextLine();
		boolean isPrimeMember = scan.nextBoolean();
		
		if (isPrimeMember == true) {
			System.out.println("You got free shipping, total price: "+price);
		}else if (price>35) {
			System.out.println("You got free shipping, total price: "+price);
		}else {
			System.out.println("Add 5$ shipping, total price: "+(price+5));
		}
	}

}
