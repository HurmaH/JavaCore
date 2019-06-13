package day17_Loop;

public class WhileLoop {
	public static void main(String[] args) {
		
		/*
		 * ( ) ---> boolean literal: true/false
		 * boolean vars boolean b = true --->b
		 * boolean expression : x<5
		 */
		
		int x=0;
		while (x<5) {
			++x;
			System.out.println("Value of x = "+x);
		}
		
		//task1
		//count from 5 to 1using while loop
		
		int y=5;
		while (y>0) {
			
			System.out.println("y value is: "+y);
			--y;
		}
		
		//Task2
		//print even number from (0-10)
		
		//option 1: 6 iteration in total
		int even1 = 0;
		while (even1<=10) {
			System.out.println("Even number: "+even1);
			even1 +=2; //even=even+2;
		}
		
		//option 1: 6 iteration in total
		int even2 = 0;
		while (even2<=10) {
					
		if(x%2==0) {
			System.out.println("Even number: "+even2);
		}
			even2 ++; //even=even+2;
		}
		
		//Task3
		//print all odd numbers from o
		
		int odd = 51;
		while (odd<100) {
			System.out.println("Odd number: "+odd);
			odd++;
		}
		
		//Optional task
		int oddEven = 50;
		while (oddEven<100) {
				if (oddEven%2==0 && oddEven>=50 && oddEven<=70) {
					System.out.println("Even between 50-70 = "+oddEven);
			    } 
				
				if (oddEven %2==1 && oddEven>70 && oddEven<100) {
					System.out.println("Odd between 70-100 = "+oddEven);
				}
				oddEven++;
			}
				
	}

}
