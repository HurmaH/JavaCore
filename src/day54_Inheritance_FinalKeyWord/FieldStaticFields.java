package day54_Inheritance_FinalKeyWord;

public class FieldStaticFields {
	
	// public static final filed --->> CONSTANT 
	  
	  // FINAL STATIC FILED VALUE MUST BE INITIALIZED BEFORE CLASS FINISH LOADING 
	  public static final String RACE = "HUMAN";    
	  static final int MAX_NUM     = getStaticNum(); 
	  
	  private static final int MAX_SPEED ; 
	  // ALL CAP IS HIGLY RECOMMENDED for naming static fild
	  //static final String lowercase = "lower"; 
	  
	  static {
	    MAX_SPEED = 120; 
	  }
	  
	  
	  public static int getStaticNum() {
	    return 200 ; 
	  }
	  
	  
	  
	  
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    
	    System.out.println( RACE  );
	    System.out.println(  MAX_SPEED  );
	    
	    //RACE = "Humanoid"; 
	    
	    System.out.println(  Integer.MAX_VALUE   );
	    System.out.println(  Math.PI    );
	    
	  }
	}

