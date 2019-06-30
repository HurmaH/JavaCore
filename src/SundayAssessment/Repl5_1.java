package SundayAssessment;

import java.util.Scanner;

public class Repl5_1 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    String vowel = "aeiou";
	    
	    for (int i=0; i<word.length(); i++) {
	    	if (vowel.contains(word.charAt(i)+"")) {
	    		System.out.print(word.charAt(i));
	    	}
	    }
	    
	}

}
