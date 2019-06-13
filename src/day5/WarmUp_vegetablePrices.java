package day5;

public class WarmUp_vegetablePrices {
	public static void main(String[] args) {
		
		// declare variables that can hold the unit price of each vegetables 
				// assign value according to the picture you saw on the screen 
				// Then print out below message by concatenating the final price of each 
				/*
				 * Expected Result ;
					1 Cucumber is 2.5 dollars
					4 Tomatoes are 12 dollars
					2 Onion is 3 dollars
					1 Pepper is 2 dollars
					6 Carrot is 24 dollars
				 * */
				//double cucumber1 = 2.5d;
		float cucumber_price = 2.5f;
		int tomato_price = 3;
		double onion_price = 1.5;
		int pepper_price = 2;
		int carrot_price = 4;
		
		System.out.println("1 Cucumber is "+cucumber_price*1+"$");
		System.out.println("4 Tomatoes is "+tomato_price*4+"$");
		System.out.println("2 Onion is " + onion_price* 2 + "$");
		System.out.println("1 Pepper is " + pepper_price + "$");
		System.out.println("6 Carrot is " + carrot_price*6 + "$");
		
		
		// Select the variable name you want to change 
		// right click --select refactor --select rename 
		// enter the name that you want to change and hit enter
		
		double total_price = cucumber_price + tomato_price*4+ onion_price*2 + pepper_price + carrot_price*6;
		
		System.out.println( "Total price : " + total_price );
		
	}

}
