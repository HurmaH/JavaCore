package day8;

import java.util.Scanner;

public class Conditional2 {
	public static void main(String[] args) {
		
		//Task2
		Scanner scan = new Scanner (System.in);
		
		double priceOfIphone, priceOfIpad, yourBudget;
		priceOfIphone = 599.99;
		priceOfIpad = 899.99;
		
		int phoneCount, tabletCount;
		
		System.out.println("Please enter Your budget: ");
		yourBudget = scan.nextDouble();
		
		System.out.println("Enter how many iPhone You want to buy?");
		phoneCount = scan.nextInt();
		System.out.println("Enter how many iPad You want to buy?");
		tabletCount = scan.nextInt();
		
		double total = phoneCount * priceOfIphone +tabletCount * priceOfIpad;
		
		System.out.println(total);
		if (total< yourBudget ) {
			System.out.println("You can buy "+tabletCount+" iPads and "
		                       + phoneCount+" iPhones with your budget!");
		}else {
			System.out.println("OUT OF BUDGET!");
			System.out.println("You need extra "+(total-yourBudget));
		}
		
		scan.close();
	}

}
