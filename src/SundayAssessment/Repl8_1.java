package SundayAssessment;

import java.util.Scanner;

public class Repl8_1 {
	public static void main(String[] args) {
	  	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
//	  	If the word ends in "y", print "-ies"
//	  	If the word ends in "ey", print "-eys"
//	  	If the word ends in "ife", print "-ives"
//	  	If none of the above is true, print "-s"
//	  	No more than one should be printed.
	  	
	  	String plural="";
	  	int len= word.length();
	  	if(word.endsWith("ey")) {
	  		plural = word+"s";
	  	}else if (word.endsWith("y")) {
	  		plural =word.substring(0, len-1)+"ies";
	  	}else if (word.endsWith("ife")) {
	  		plural =word.substring(0, len-3)+"ives";
	  	}else {
	  		plural = word+"s";
	  	}
	  	
	  }

}
