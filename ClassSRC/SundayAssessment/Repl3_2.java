package SundayAssessment;

import java.util.Scanner;

public class Repl3_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int statusCode = scan.nextInt();
	    switch(statusCode){
	    case 200:
	    	System.out.println("OK (fulfilled)");
	    	break;
	    case 401:
	    	System.out.println("unauthorized");
	        break;
	    case 403:
	    	System.out.println("forbidden");
	    	break;
	    case 404:
	    	System.out.println("not found");
	    	break;
	    case 500: 
	    	System.out.println("server error");
	    	break;
	    default:
	    	System.out.println("not supported status code");
	      
	    }
	}

}
