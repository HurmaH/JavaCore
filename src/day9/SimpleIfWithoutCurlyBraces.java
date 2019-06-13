package day9;

import java.util.Scanner;

public class SimpleIfWithoutCurlyBraces {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter numbers");
		int x=scanner.nextInt();
		
		//curly braces for if and else block are optional 
		//only when we have a single statement
		if (x != 10 ) 
			System.out.println("Not 10!");
			//System.out.println("Not 10 again); //2nd statement will giveerror 
		else 
			System.out.println("Yes it is 10 !");
			System.out.println("Yes, it is 10");//if it is 2 line, 2nd line will be printed in a ny cases
	}

}
