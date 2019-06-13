package day37_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
	// CREATE ARRAYLIST OF DOUBLE 
    // CALL IT priceList 
    // Add 5 prices  
    // try to get 3rd items 
    // iterate over arraylist using both loops 
    // and print out 
    
    // in another loop 
    // only print out price more than 10 ;
	public static void main(String[] args) {
		
		
		ArrayList <Double> priceList= new ArrayList<>();
		priceList.add(12.0); //it is not accepting int 
		priceList.add(5.0);
		priceList.add(100.5);
		priceList.add(15.0);
		priceList.add(10.5);
		
		//get 3rd item
		System.out.println("3rd price: "+priceList.get(2));
		
		//print all
		for (Double price:priceList) {
			System.out.println(price);
		}
		
		System.out.println("------------");
		//print prices more than 10
		for (double price:priceList) {
			if (price>=10) {
				System.out.println(price);
			}
		}
		
		System.out.println("------------");
		//Get sum of all items
		int sum =0;
		for (double price:priceList) {
			sum += price;
		}
		System.out.println("sum : "+sum);
	
	}

}
