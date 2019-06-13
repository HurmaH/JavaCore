package day30_Methods;

import day29_MethodIntroNoteInside.Spartan;

public class CallingMethodFromOtherPackage {
	public static void main(String[] args) {
		
		//calling the method
		UserInput.printUsersName();
		//calling the method
		//Utility.printUswrsName();
   
	    // Arrays.sort(arrObject) ; 
	    
	    // We can call methods coming from 
	    // different classes 
	    // if the class is under same package no import needed
	    // if the class is under different package import is mandatory
	    Spartan.releaseTheHorse();
	}

}
