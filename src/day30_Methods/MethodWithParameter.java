package day30_Methods;

import java.util.Scanner;

public class MethodWithParameter {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String s = "abc";
		System.out.println(s.substring(1, 3));
		
		//callin methods with parameter double
		printTheSum (5,19);
		printTheSum (52.6,19.8);
		
		
	}
	
	public static void printTheSum (double num1, double num2) {
//		System.out.println("enter numbers");
//		Scanner scan = new Scanner (System.in);
//		double num11= scan.nextDouble();// if this wanted to use 
//		double num21 = scan.nextDouble();
		
		System.out.println("the sum of number is :"+(num1+num2));
	}
	


}
