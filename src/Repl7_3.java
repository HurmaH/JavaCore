import java.util.Scanner;

public class Repl7_3 {
	
	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("# in:");
		    int amt = inp.nextInt();
		    inp.nextLine(); //this line is necessary
		    System.out.print("word:");
		    String word = inp.nextLine();
		    //leave the above unedited, write your code below:
		    
		    //Example: amt=4, word=knife
		                  //plural=kni+ves
		    
		    String plural=""; 
		    int len = word.length();
		    
		    if (word.endsWith("fe")) {
		    	plural=word.substring(0, len-2 )+"ves";//kni+ves
		    			    
		    }else if (word.endsWith("sh") || word.endsWith("ch")) {
		    	plural=word.substring(0, len-2 )+"es";
		    
		    }else if(word.endsWith("us")) {
		    	plural=word.substring(0, len-2 )+"i";
		    	
		    }else if(word.endsWith("ay") || word.endsWith("oy") || 
		    	     word.endsWith("ey") || word.endsWith("uy")) {
		    	plural=word.substring(0, len-2 )+"s";
		    	
		    }else if (word.endsWith("y")) {
		    	      plural=word.substring(0, len-1 )+"ies";
		    	      
		    }else {
		    	plural=word+"s";
		    }
		        
		    
		    System.out.println(amt+" "+plural);//4 knives
		    
		    
		
	}

}
