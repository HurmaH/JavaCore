package SundayAssessment;

import java.util.Scanner;

public class Repl9_4 {

	public static void main(String[] args) {
		    System.out.println("Please enter word:");
		    Scanner scanner = new Scanner(System.in);
		    String n1 = scanner.nextLine();
		    
		    // Your code here
		    //------------------------------------------------

		    boolean has8 = n1.length()>=8;
		    boolean hasUpper=false;
		    boolean hasLower=false;
		    boolean hasDigit = false;
		    boolean hasSpecial =false;
		    
		    String special = "~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.";
		    
		    for (int i=0; i<n1.length(); i++) {
		    	if (n1.charAt(i)>='A' && n1.charAt(i)<='Z') { hasUpper =true; }
		    	
		    	if (n1.charAt(i)>='a' && n1.charAt(i)<='z') { hasLower = true;}
		    	
		    	if (n1.charAt(i)>='0' && n1.charAt(i)<='9') { hasDigit = true;}
		    	
		    	if (special.contains(n1.charAt(i)+"")) {hasSpecial = true;
		    	}		    	
		    }
		    
		    
		    if (has8==false) {
		    	System.out.println("Password should contain minimum 8 characters");
		    }
		    if(hasUpper==false) {
		    	System.out.println("Password should contain at least 1 uppercase number \r\n" + 
		    			"");
		    }
		    if(hasLower==false) {
		    	System.out.println("Password should contain at least 1 lowercase number");
		    }
		    if(hasDigit == false) {
		    	System.out.println("Password should contain at least 1 digit ");
		    }
		    if (hasSpecial ==false) {
		    	System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,. ");
		    }
		    
		    if (has8 && hasUpper && hasLower && hasDigit && hasSpecial) {
		    	System.out.println("Your password is accepted ");
		    }
		    
		    
		    
		 
	 }

}
