package day26;

import java.util.Arrays;

public class GrocerySplitTask {
	public static void main(String[] args) {
		// 1. create a string called groceries 
		//2. add items separated by comma 
		//3. split them and print them out 
		//4.  find out size of split 
		//5. find out length of each items 
		
		//1. & 2.
		String groceries = "apple,tomato,potato,lettuce,kiwi,blueberry";
		
		//3.
		String [] arrGroceries = groceries.split("z");
		System.out.println(Arrays.toString(arrGroceries));
		
		//4. 
		int sizeArr = arrGroceries.length;
		System.out.println(sizeArr);
		
		//5. find out length of each items
		for (int i=0; i<arrGroceries.length; i++) {
			System.out.println("Length of "+arrGroceries[i].trim()+": "+arrGroceries[i].trim().length());
		}
		
		
		
		
	}
		
}

