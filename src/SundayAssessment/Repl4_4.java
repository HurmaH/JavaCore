package SundayAssessment;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl4_4 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList <>(Arrays.asList("a","b","c", "d", "e", "f"));
		//System.out.println(removeEveryOther(words));
	}
	
//	Create a method that:
//		is called removeEveryOther
//		returns nothing
//		takes in a single parameter - an ArrayList of Strings called words
//
//		This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.
//
//		For example, if the parameter is:
//		("hi","yo","sup","yolo","boop")
//		The modified ArrayList should be:
//		("yo","yolo")
	
	public static void removeEveryOther(ArrayList<String> words){
		for (int i=0; i<words.size()/2; i++) {
		words.remove(i);
		}
	}

}
