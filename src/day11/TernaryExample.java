package day11;

import java.util.Scanner;

public class TernaryExample {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	double price;
	String label;
	
	System.out.println("Please enter price:");
	price=scan.nextDouble();
	
	label = (price>100.0) ? "expensive":"cheap";
	System.out.println(label);
	
	}
	
	
	

}
