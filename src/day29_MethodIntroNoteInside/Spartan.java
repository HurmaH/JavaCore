package day29_MethodIntroNoteInside;

public class Spartan {
	 
	public static void releaseTheHorse() {
		    System.out.println("RELEASE IT NOW PLEASE  GO !!!!");
	}
		  
	 public static void main(String[] args) {
		    
		    Spartan.releaseTheHorse();
		    Spartan.releaseTheHorse();
		    releaseTheHorse();        //as it is in same class we can call without classname
	 }

}
