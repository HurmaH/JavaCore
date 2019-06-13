package CodingBat;

import java.util.Scanner;

public class Logic_Alarm {//3, 5
	static void main(String [] KFC) {
	Scanner scan = new Scanner (System.in);
	
	int day = scan.nextInt();
	boolean vacation = scan.hasNextBoolean();
	
		  if ((day != 0 && vacation == false) || 
		      (day != 6 && vacation == false)) {
		    System.out.println("7:00");
		  }else if((day == 0 && vacation == false) || 
		           (day == 6 && vacation == false)){
			  System.out.println("10:00");
		  }else if((day != 0 && vacation==true) ||
		           (day != 6 && vacation==true)) {
			  System.out.println("10:00");
		  }else if ((day == 0 && vacation==true) ||
		            (day == 6 && vacation==true)) {
			  System.out.println("off");
		  }

		}


}
