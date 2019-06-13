package day10;

import java.util.Scanner;

public class VarAssignmentBeforeUsage {
	
	public static void main(String[] args) {
		//local variables must be assigned to a value before usage
		//if local variable has a single chance
		//to not get  a value before usage
		//compiler will not compile the code
		
		int i=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Do you want to give value to i: ");
		String yesNoAnswer = scan.nextLine();
		if (yesNoAnswer.equalsIgnoreCase("yEs")) {
			System.out.println("You said yes");
			System.out.println("Enter YOur number");
			i = scan.nextInt();
			System.out.println("The value of i : "+i);
		}else {
			System.out.println("You said no");
		}
	}

}
