package day19_WhileLoop;

import java.util.Scanner;

public class LoopPractice {
	
	public static void main(String[] args) {
		//Ask user to enter a word
		//for example Hurmik
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("ENTER a name:");
		String word = scan.next();
		    
	     int x = 0 ; 
	    //forward
	    while(x<word.length()) {
	      System.out.print (  word.charAt(x)  + "-");
	      x++ ; //++x
	    }
	    System.out.println();
	    
	    //reverse
	    int y = word.length()-1;
	    while (y>=0) {
	    	System.out.print(word.charAt(y)+"");
	    	y--;
	    }
	    
	    System.out.println();
	    //optional --check how many a exists in name
	    int z = 0;
	    int aCount=0;
	    while(z<word.length()) {
	    	if (word.charAt(z)=='a') {
	    		aCount++;
	    	}
	    	z++;
	    }
	    System.out.println("There are "+aCount+"a");
	    
	    
//	    System.out.println();
//	    System.out.print(word.charAt(0)+"-");
//	    System.out.print(word.charAt(1)+"-");
//	    System.out.print(word.charAt(2)+"-");
//	    System.out.print(word.charAt(3)+"-");
//	    System.out.print(word.charAt(4)+"-");
//	    
	    
	}

}
