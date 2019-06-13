package day39_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWithMethod {
	
	public static void main(String[] args) {
		List <String> myList 
		 = new ArrayList (Arrays.asList("apple", "kiwi", "orange", "papaya" , "banana" ));
		
		List <String> veggies = new ArrayList <>();
		veggies.add("spinach");
		veggies.add("kale");
		veggies.add("cucumber");
		veggies.add("parsley");
		veggies.add("zuccini");
		
		
		printItems (myList);
		printItems (veggies);
		
		System.out.println(getListFrom (12));
		System.out.println(getListFrom (18));
		System.out.println(getListFrom (100));
		
	}
	
	public static void printItems ( List <String> strList) {
		
		for (int i=0; i<strList.size(); i++) {
			System.out.print(strList.get(i)+" - ");
		}
		System.out.println();
	}
	
	//create a method that accept a number as ending point
	//and return List of INTEGER from 1 to that that number
	public static ArrayList <Integer> getListFrom (int x) {
		ArrayList <Integer> numList = new ArrayList <>();
		for (int i=1; i<=x; i++) {
			numList.add(i);
		}
	
		return numList;
	}

}
