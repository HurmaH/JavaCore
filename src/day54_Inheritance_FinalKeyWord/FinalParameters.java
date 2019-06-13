package day54_Inheritance_FinalKeyWord;

public class FinalParameters {
	
	public static void main(String[] args) {
		
		printItems ("abc efg");
		printItems (200);
	}
	
	public static void printItems (String item) {//can be reassigned
		item = "some other value";
		System.out.println("the item is "+item);
	}
	
	public static void printItems (final int num) { //cannot be reassigned
		//num =150; ----> cannot be reassigned
		System.out.println("the number is "+num);
	}

}
