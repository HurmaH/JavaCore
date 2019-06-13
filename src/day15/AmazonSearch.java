package day15;

import java.util.Scanner;

public class AmazonSearch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		//ask user to items to search for 
		// verify the tab name has changed to Amazon.com : yourText
		
		System.out.println("Enter items to search for : ");
		String itemToSearch = scan.nextLine();
		
		System.out.println("You have entered: "+itemToSearch);
		
		String expectedResult = "Amazon.com :iPad";
		String actualResult = "Amazon.com :"+itemToSearch;
		
		if (expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test passed for ipad");
		}else {
			System.out.println("Test failed for ipad");
		}
		
		scan.close();
	}

}
