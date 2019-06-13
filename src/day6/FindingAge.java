package day6;

import java.util.Calendar;
import java.util.Scanner;

public class FindingAge {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//ask questions
		System.out.println("Enter Your name today :");
		//save user input into String
		String name = input.next();
		//scan.nextLine();
				
//		System.out.println("Enter Your age today :");
//		//save user input into int
//		int age = input.nextInt();
		
		//TASK 2
		System.out.println("Enter Your Birth Year  :");
		int by = input.nextInt();
		
		//getting current year
		Calendar cal = Calendar.getInstance();//I got from Google :)
		int currentYear = cal.get(Calendar.YEAR); // got from Google :)
		
		System.out.println("Current Year is  :"+currentYear);
		int age = currentYear-by;
	
		System.out.println("Your name is : "+name);
		System.out.println("Your age  is : "+age);
				
		input.close();
	}

}
