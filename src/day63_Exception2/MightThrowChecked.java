package day63_Exception2;

import java.io.IOException;

public class MightThrowChecked{
	
public static void main(String[] args) {   // throws InterruptedException { // throws IOException {
		
		// handle or declare	
		System.out.println("Beginning");
// The only indication that tell you , 
// you must handle or declare an exception when you try to call a method is 
// THE METHOD SIGNATURE 
// If the method signature document that this method call might throw 
// some type of CHECKED EXCEPTION then then caller must handle or declare  
		
		waitFewSecond(3);
		//Thread.sleep(1000);
		
		try {
			playWithFire();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("caught the fish!!!");
		}
		
		System.out.println("Ending");

	}	
// handle or declare	
	public static void waitFewSecond(int second) {
		
		
		try {
			Thread.sleep( second * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("this is caught");
		}
		
	}

	
	
	public static void playWithFire() throws IOException{
		
		System.out.println("Playing with fire");
		
		//try {
		//	throw new IOException();
		//} catch (IOException e) {
		//	System.out.println("CAUGHT EXCEPTION");
		//} 
		
	}

}
