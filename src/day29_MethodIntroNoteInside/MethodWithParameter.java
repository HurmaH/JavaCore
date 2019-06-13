package day29_MethodIntroNoteInside;

public class MethodWithParameter {
	

		  public static void main(String[] args) {
		   
			  //Arrays.sort
			  
			  holdYourHorse();       //using overload1
			  holdYourHorse("Mekan");//using overload
			  holdYourHorse("Hurmik");
			  
		  }
		  
		  
		  public static void holdYourHorse() {               //overloading1
		     String owner = "Mekan" ;
		     System.out.println(owner + ", hold your horse please!");       
		  }
		  
		  public static void holdYourHorse(String owner) {   //Overloading2
			 System.out.println(owner + ", hold your horse please!");       
		  }

}
