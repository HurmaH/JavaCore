package day18_WhileLoops;

public class WhileLoop {
	public static void main(String[] args) {
		

	    // DRY Principle 
	    // DO NOT REPEAT YOURSELF 
	    
	    /*
	     * */
	    
	    int x = 10 ; 
	    if(x>5) {
	      System.out.println("DO THIS");
	    }else {
	      System.out.println("DO THAT");
	    }
	    
	    /*
	     * while(as long as some condition is true){
	     *   
	     *   repeat this action 
	     * 
	     * }
	     * 
	     * 
	     * */
	    int y = 10 ;  
	    while( y > 5) {
	      
	      System.out.println(" do this " + y-- );
	      //y -- ; 
	      
	    }
		
	}

}
