package SundayAssessment;

import java.util.Scanner;

public class Repl9_2 {
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    for (int i=0; i<word.length(); i++) {
	    	System.out.println(word.charAt(i));
	    }
	    
	  }

}
