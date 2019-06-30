package day62_Exception;

import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {
		System.out.println("Beginning of the code ");
		
		Scanner scan = new Scanner(System.in);
		//you wrap up the code that might throw exception
		//if there is exception catch
		//ArithmaticException object is created behind the scene
		
		
		System.out.println("Enter num1");
		int num1 = scan.nextInt();
		System.out.println("enter num2");
		int num2 = scan.nextInt();
		
		try {
		System.out.println("Division is :"+num1/num2);//this line might have AritmathicException so try catch block added
		
		}catch (ArithmeticException e ) {//new ArithmeticException happens behind
			System.out.println("You have entered 0 for num2. \nEnter new number");
			num2=scan.nextInt();
			System.out.println("New Division is :"+num1/num2);
		}
		System.out.println("End of code");
	}

}
