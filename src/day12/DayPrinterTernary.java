package day12;

import java.util.Scanner;

public class DayPrinterTernary {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	int dayNum;
	String dayWord;
	
	System.out.println("Please enter day number of week:");
	dayNum = scan.nextInt();
	
	dayWord = (dayNum==1)? "Monday": (dayNum==2) ? "Tuesday"
			 :(dayNum==3)? "Wednesday": (dayNum==4)? "Thursday"
			 :(dayNum==5)? "Friday" : (dayNum==6) ? "Saturday"
			 :(dayNum==7)? "Sunday": "Invalid Day";
	
	System.out.println("Day of the week is :"+dayWord);
	
	scan.close();
	
	}
}
