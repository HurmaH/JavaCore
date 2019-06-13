package day12;

import java.util.Scanner;

public class SwitchStatement {
	 public static void main(String[] args) {

		    Scanner s = new Scanner(System.in);

		    System.out.println("how is weather today?");

		    String weather = s.next();

		    switch(weather){
		    
		      case "sunny" :
		        System.out.println("go swimming");
		        System.out.println("go swimming");
		        
		        break; // IT WILL get out of the switch statement 
		      
		      case "windy" :
		        System.out.println("go fly a plane ");
		        break; 
		      
		      case "rainy" :
		        System.out.println("stay home ");
		        break; 
		      
		      case "snowy" :
		        System.out.println("go snowboarding");
		        break; 
		      
		      default :
		        System.out.println("are you sure this is a right weather");
		        break ; 
		    }
		    
//		    if (weather.equals("sunny")) {
//		      
//		      System.out.println("go swimming");
//		    
//		    } else if (weather.equals("windy")) {
//		    
//		      System.out.println("go fly a plane ");
//		      
//		    } else if (weather.equals("rainy")) {
//		      
//		      System.out.println("stay home ");
//
//		    } else if (weather.equals("snowy")) {
//		      
//		      System.out.println("go snowboarding ");
//		    
//		    }else{
//		      System.out.println("are you sure this is a right weather");
//		    }
		    
		    
	 }

}
