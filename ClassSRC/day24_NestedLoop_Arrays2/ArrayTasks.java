package day24_NestedLoop_Arrays2;

import java.util.Arrays;

public class ArrayTasks {
	public static void main(String[] args) {
		
		//
		//1
		char [] nameArray1 = new char [6];
		nameArray1[0] = 'H';
		nameArray1[1] = 'u';
		nameArray1[2] = 'r';
		nameArray1[3] = 'm';
		nameArray1[4] = 'i';
		nameArray1[5] = 'k';
		for (int i=0; i< nameArray1.length; i++) {
			System.out.print(nameArray1[i]);
		}
		System.out.println(Arrays.toString(nameArray1));
		
		//2
		char nameArray2 [] = new char [] {'M','i','s','h','k','a'};
		for (int i=0; i< nameArray2.length; i++) {
			System.out.print(nameArray2[i]);
		}
		System.out.println(Arrays.toString(nameArray2));
		
		//3
		char nameArray3 [] = {'M','e','k','a','n'};
		for (int i=0; i< nameArray3.length; i++) {
			System.out.print(nameArray3[i]);
		}
		System.out.println(Arrays.toString(nameArray3));
		
		char [] nameArray4 = {'B','e','n','j','a','m','i','n'};
		
		//how to get last items
		int count = nameArray3.length;
		System.out.println( "item in last index : " +  nameArray3[count-1]);
		
		
		// how do we get the one in the middle 
	    int midIndex = count/2 ; 
	    System.out.println( "item in mid index : " +  nameArray3[midIndex] );
	    
	    
	    //print in reverse order
	    for (int i=nameArray3.length; i>=0; i--) {
	    	System.out.println(nameArray3);
	    }
	
	}

}
