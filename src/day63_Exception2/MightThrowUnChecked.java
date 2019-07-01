package day63_Exception2;

import java.io.IOException;

public class MightThrowUnChecked {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Beginning");
		try {
			playWithWater();
		//} catch (Exception e) {
		//} catch (RuntimeException |IOException  e) {
		} catch (RuntimeException e) {
				
			// TODO Auto-generated catch block
			System.out.println("CAUGHT");
		} finally {
			System.out.println("THIS IS THE REALLY END OF TRY CATCH FINALLY BLOCK");
		}
		System.out.println("Ending");
		
		
	}
	// stack trace is the red that you see in the console 
	// to tell you where is this exception originated and where are you trying to call it 
	
	public static void playWithWater() throws RuntimeException, IOException{
	
		
		System.out.println("play With Water");
		 throw new RuntimeException(); 
		
	}


}
