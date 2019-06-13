package day29_MethodIntroNoteInside;

import java.util.Arrays;

public class day29_Methods {
	public static void main(String[] args) {
		/*
		 * Create array of 2 Dimensional String Array , the pizza has 7 slice , each slice can be finished in 3 bites , each bite has different topping as color code on the right : total 21 toppings.
Task 1.1 : create 2D String array to represent below scenario( using any one of 3 way to create and assign value to array)
Task 1.2 : print out to see what’s inside using the Arrays class method
Task 1.3 print all the value inside using for loop
Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper
		 */
		
		//Task1.1
		String [][] pizza= {{"mushroom","black olive","green pepper"},
		          {"spinach","green pepper","mushroom"},
		          {"black olive","black olive","spinach"},
		          {"mushroom","mushroom","red pepper"},
		          {"banana pepper","spinach","red pepper"},
		          {"mushroom","green pepper","green pepper"},
		          {"spinach","green pepper","mushroom"}};
		
		//Task1.2
		System.out.println(Arrays.deepToString(pizza));//using Arrays Method
		System.out.println("-------------------");
		//Task1.3
		for (int i=0; i<pizza.length; i++ ) { //slice loop
			System.out.println("Slice number "+(i+1));
			for (int j=0; j<pizza[i].length; j++) {//topping loop
				System.out.print(pizza [i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		
		//Task1.4
		for (int i=0; i<pizza.length; i++ ) { //slice loop
			System.out.println("Slice number "+(i+1));
			if ((i+1)==3) { //third slice i starts from zero
				continue;
			}
			for (int j=0; j<pizza[i].length; j++) {//topping loop
				System.out.print(pizza [i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		//1.5
		outer:       //--->label to stop system
		for (int i=0; i<pizza.length; i++ ) { //slice loop
			String temp="";
			System.out.println("Slice number "+(i+1));
			for (int j=0; j<pizza[i].length; j++) {//topping loop
								
				if (pizza [i][j].equals("banana pepper")) {//when topping=banana pepper break loop
					temp=pizza [i][j];
					break outer;       //--->label to stop system
				
				}
				
				System.out.print(pizza [i][j]+", ");
				
			}
			
//			if (temp.equals("banana pepper")) {
//				break;
//			}
//			
        	System.out.println();
		}
		
		
		
	}

}
