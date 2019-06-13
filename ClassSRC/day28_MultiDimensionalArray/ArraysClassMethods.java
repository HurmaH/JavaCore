package day28_MultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassMethods {
	public static void main(String[] args) {
	
	/*
	 * Arrays Class methods to work with array object
	 * 
	 * toString (arrObject)           --> return string rep of array items
	 * sort (arrObject);              --> sort the array
	 * copyOf(arrObject, lengOfNewArr)--> new array with length defined and
	 * 									  everything copied from original
	 * copyOfRange(arrObj, from, to)  --> works like substring
	 * equals (arr1, arr2)            --> true false if all elements are the same 
	 * 									  and
	 * binarySearch
	 * 
	 * fill (arrObj, item)            --> filling array with specified item
	 */
	
	String [] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"};
	
	Arrays.sort(words);
	System.out.println(Arrays.toString(words));
	

    String[] first2words = Arrays.copyOf(words, 2) ;
    System.out.println( Arrays.toString(first2words) );
    
    String[] tenItem = Arrays.copyOf(words,10) ;
    System.out.println( Arrays.toString(tenItem) );
    
    String[] copyOf2 = Arrays.copyOfRange(words,3,5) ;
    System.out.println( Arrays.toString(copyOf2) );
    
    //fill
    int [] num = new int [100];
    System.out.println(Arrays.toString(num));
    Arrays.fill(num, 5);
    System.out.println(Arrays.toString(num));
    
    
    // create a program to add items to an array by users input 
    // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17} 
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter word:");
    
    String usersWord = scan.next();
    
    String [] newWord = Arrays.copyOf(words, words.length+1);
    System.out.println(Arrays.toString(newWord));
    
    int lastIdxNewWord = newWord.length-1;
    newWord[lastIdxNewWord] = usersWord;
    System.out.println(Arrays.toString(newWord));
	
	}
}
