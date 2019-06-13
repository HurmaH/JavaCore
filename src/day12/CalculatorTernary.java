package day12;

import java.util.Scanner;

public class CalculatorTernary {
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter 2 numbers:");
		int n1=scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("Enter operator: \"+\", \"-\", \"*\", \"/\"");
		String operator = scan.next();
		
		String result = (operator.equals("+"))? ("the addition result is: "+(n1+n2))
				       :(operator.equals("-"))? ("the subtraction result is: "+(n1-n2))
				   	   :(operator.equals("*"))? ("the multiplication result is: "+(n1*n2))
				   	   :(operator.equals("/"))? ("the division result is: "+(n1/n2))
				   	   :("INVALID OPERATOR");;	   
				
				   	   System.out.println(result);
//		switch (operator) {
//			case "+":
//				System.out.println("the addition result is: "+(n1+n2));
//			case "-":
//				System.out.println("the subtraction result is: "+(n1-n2));
//			case "*":
//				System.out.println("the multiplication result is: "+(n1*n2));
//			case "/":
//				System.out.println("the division result is: "+(n1/n2));
//				
//			default:
//				System.out.println("INVALID OPERATOR");
//		}
	}

}
