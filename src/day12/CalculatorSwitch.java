package day12;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Please enter 2 numbers:");
	int n1=scan.nextInt();
	int n2 = scan.nextInt();
	
	System.out.println("Enter operator: \"+\", \"-\", \"*\", \"/\"");
	String operator = scan.next();
	
	switch (operator) {
		case "+":
			System.out.println("the addition result is: "+(n1+n2));
			break;
		case "-":
			System.out.println("the subtraction result is: "+(n1-n2));
			break;
		case "*":
			System.out.println("the multiplication result is: "+(n1*n2));
			break;
		case "/":
			System.out.println("the division result is: "+(n1/n2));
			break;
		default:
			System.out.println("INVALID OPERATOR");
	}
	
	System.out.println("Please enter 2 numbers:");
	int n3=scan.nextInt();
	int n4 = scan.nextInt();
	
	System.out.println("Enter operator: \"plus\", \"minus\", \"multiply\", \"devide\"");
	String operator2 = scan.next();
	
	switch (operator2.toLowerCase()) {
		case "plus":
			System.out.println("the addition result is: "+(n3+n4));
			break;
		case "minus":
			System.out.println("the subtraction result is: "+(n3-n4));
			break;
		case "multiply":
			System.out.println("the multiplication result is: "+(n3*n4));
			break;
		case "devide":
			System.out.println("the division result is: "+(n3/n4));
			break;
		default:
			System.out.println("INVALID OPERATOR");
	}
	scan.close();
  }
}
