package day18_WhileLoops;

import java.util.Scanner;

public class GiveMeFive {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int x = 0;
		
		while (x != 5) {
			System.out.println("Give me 5");
			x= scan.nextInt();
		}
		
		System.out.println("Yay Good Job!");
		
		//TASK
		double money=0;
		
		while (!(money == 5 || money ==10)) { //(money !=5 && money !=10)
			
			System.out.println("Please give me 5$ or 10$ bill?");
		    money = scan.nextDouble();
		}
		
		System.out.println("Thank You!");
		
		  
	}

}
