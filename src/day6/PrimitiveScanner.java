package day6;

import java.util.Scanner;

public class PrimitiveScanner {
	public static void main(String[] args) {
		//Be careful, bear should not large fluffy dog
		//boolean char, byte short long float double
		Scanner inp = new Scanner(System.in); 
		
		 //byte b1 = inp.nextByte();
	    //short s1 = inp.nextShort();
		//double d1 = input.nextDouble();
		System.out.println("Enter float value : ");
		float f1 = inp.nextFloat(); 
		System.out.println( "You have entered float value " + f1 );
		
		System.out.println("Are you hungry ? " );
	    boolean isHungry = inp.nextBoolean();
	    System.out.println(" I am hungry " + isHungry);
	}

}
