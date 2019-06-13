package day13;

import java.util.Scanner;

public class Task1 {
	// TASK 1 
    /*
     * Ask user for two names 
     * check for the equality without caring about the case   print result 
     * 
     * also compare the length of the names 
     *    if name 1 has more character ---> print second character 
     *    else  print 3rd character 
     */
     
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	System.out.println("Please enter 2 names");
	String name1 = scan.nextLine();
	String name2 = scan.nextLine();
	
	if (name1.length()>name2.length()) {
		System.out.println(name1.charAt(1));
	}else {
		System.out.println(name2.charAt(2));
	}
	
	// OPTIONAL 
    //store the last character of name 2 in char variable
	
	//create switch statement to check few cases as below 
    /*  case 'a' --> print name ended with a 
    *  case 'b' --> print name ended with b 
    *  case 'c' --> print name ended with c 
    *  if no match print  did not get abc 
    */
	
	char lastChar = name2.charAt(name2.length()-1);
	
	switch (lastChar) {
	case 'a':
		System.out.println("name ended with a");
	    break;
	case 'b':
		System.out.println("name ended with b");
		break;
	case 'c':
		System.out.println("name ended with c");
		break;
	default:
		System.out.println("did not get abc");
	}
			
	
	
	
	}
	
}
