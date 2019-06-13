package day12;

import java.util.Scanner;

public class WeekendWeekDay {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan=new Scanner(System.in);
			int daynum;
			String dayWord="";
			
			System.out.println("Enter the day");
			daynum=scan.nextInt();
		    // from 1-5 it is weekdays, 6-7 weekend.
			// also we can write in  one line like 
			//case 1: case 2: 
			
						
			switch(daynum) {
			case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					dayWord = "Weekdays";
					break;
				case 6:
				case 7:
					dayWord = "Weekend";
					break;
					
			}
			
			System.out.println(dayWord);
		}

}
