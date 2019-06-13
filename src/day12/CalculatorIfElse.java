package day12;

import java.util.Scanner;

public class CalculatorIfElse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter 2 numbers:");
		int n1=scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("Enter operator: \"+\", \"-\", \"*\", \"/\"");
		String operator = scan.next();
		
						
		if (operator.equals("+")) {
			System.out.println("the addition result is: "+(n1+n2));
		}else if (operator.equals("-")) {
			System.out.println("the subtraction result is: "+(n1-n2));
		}else if (operator.equals("*")) {
			System.out.println("the multiplication result is: "+(n1*n2));
		}else if(operator.equals("/")) {
			System.out.println("the division result is: "+(n1/n2));
		}else {
			System.out.println("INVALID OPERATOR");
		}
	}

}
