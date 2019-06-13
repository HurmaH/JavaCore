package day54_Inheritance_FinalKeyWord;

public class FinalInstanceFields {
	
	//Final Fields need to be initialized like local variable
	//BEFORE THE OBJECT CREATION COMPLETED
	
	final int NUM = 100;//way1
	final int NUM2;
	final int NUM3;
	final int NUM4 = getNumber();
	
	{
		NUM2=200; // way2
	}
	
	public FinalInstanceFields() {
		
		NUM3=300;  //way3
		
	}
	
	public int getNumber() {
		return 400;
	}
	
	public static void main(String[] args) {
		
		//local final variable does not have to get initial value
		//IF NOT USED
		
		//local final variable cannot be reassigned once it get initial value
		final int x;
		x=20;
		//x=30;
		System.out.println(x);
	}
	

}
