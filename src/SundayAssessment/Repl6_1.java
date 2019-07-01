package SundayAssessment;

import java.util.Scanner;

public class Repl6_1 {
/*
 * Sample input/outputs:
   In: powerful
   pOwErFuL
 */
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    String newStr="";
	    for (int i=0; i<s.length(); i++) {
	    	//if (i!=s.length()-1) {
	    		if (i%2==0) {
	    	  		newStr+=s.substring(i, i+1).toLowerCase();
	    		}else {
	    			newStr+=s.substring(i, i+1).toUpperCase();
	    		}
//	    	}else {
//	    		if (i%2==1) {
//	    	  		s.substring(i).toLowerCase();
//	    		}else {
//	    			s.substring(i, i+1).toUpperCase();
//	    		}
//	    	}
	    }
	    
	    System.out.println(newStr);
	    
	    
	  }

}
