package day12;

import java.util.Scanner;

public class ConditionalReview {
	public static void main(String[] args) {
		
		//
		Scanner scan = new Scanner (System.in);
		String weather;
		String action;
		System.out.println("Please enter the weather:");
		weather = scan.nextLine();
		action =(weather.equalsIgnoreCase("sunny")) ? "go out":(weather.equals("rainy"))? "take umbrella":"stay home";
		System.out.println(action);
		
		scan.close();
	}

}
