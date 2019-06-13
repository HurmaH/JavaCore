package day31_MethodsReturn;

import java.util.Arrays;

public class MethodDecidingTips {
	public static void main(String[] args) {
		/*
		 * methods:
		 * reusable code, maintainable code, write once and use it whenever needed
		 * 	
		 * 3 questins to ask while creating a method:
		 * 
		 * does this method needs an object or not whn being called 
		 *  -->> if not we use static key word
		 *  
		 *  does this method take external data or not 
		 *  -->> if it does not we just end method name with empty ()
		 *  -->> if yes put data type and name : parameters seperated by comma
		 *  
		 *  does this method return a value after being called
		 *    --> if not use void
		 *    --> if yes put data type of the variable that it return
		 *  -->> if not we use static key word
		 *  
		 */
		
		String s ="abc";
		System.out.println(s.charAt(0));
		
		int [] arr = {1,2};
		Arrays.sort(arr);
		
		//create a static method with no return type
		//take one int array as parameter and print them out in one line
		//with - in between
		
		arrayPrinterWithDash(arr);
		
		arrayPrinterWithDash(new int[] {1,2,3,6,5,5,65});
		
		
	}
	
	public static void arrayPrinterWithDash (int[] manyItems) {
		for (int i=0; i<manyItems.length; i++) {
			System.out.print(manyItems[i]+"-");
		}
		System.out.println();
	}
	
	

}
