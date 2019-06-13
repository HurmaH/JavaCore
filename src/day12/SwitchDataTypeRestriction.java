package day12;

public class SwitchDataTypeRestriction {
	
	public static void main(String[] args) {
		
		//What data types are supported for switch variables
		// char, byte, short, int, String
		
		char myChar = 'g';
		
		switch (myChar) {
		case 'a':
			System.out.println("you selected a");
			break;
		case 'b' :
			System.out.println("you selected b");
			break;
		case 'c' :
			System.out.println("you selected c");
			break;
			
		default:
			System.out.println("you did not select different letter");	
		}
		
		
		
	}

}
