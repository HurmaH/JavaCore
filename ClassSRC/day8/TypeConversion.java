package day8;

public class TypeConversion {
	
	//Converting from one data type to another data type
	//converting from smaller data type to bigger type is called type widening /upcasting
	//converting from bigger data type to smaller type is called type widening /upcasting
	
	public static void main(String[] args) {
		
		int medium = 10;
		//byte, short, int, long
		//short, tall, medium, grande
		
		//long grande =10;
		long grande = medium;//type widening / upcasting
		System.out.println(grande);
		
		//short tall = 5L cannot put long value inside any variable that has smaller range
		
		short tall = (short)grande; //type narrowing /downsiding
		
		double superGrande = 15.67d;
		int mediumCup = (int) superGrande;
		System.out.println();
		
		byte tinyExpressCup = 2;
		mediumCup = tinyExpressCup; //type widening / upcasting
		mediumCup = (int) tinyExpressCup;
		
		
		
		
	}

}
