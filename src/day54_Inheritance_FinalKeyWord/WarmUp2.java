package day54_Inheritance_FinalKeyWord;

import java.util.Random;

public class WarmUp2 {
	
	int num =getNumber(); //100, method can be called directly to initialize value
	
	public static void main(String[] args) {
		WarmUp2 w = new WarmUp2();
		System.out.println(w.num);
	}
	
	public int getNumber() {
		
		Random r = new Random ();
		int num = r.nextInt(100);
		return num;
	}

}
