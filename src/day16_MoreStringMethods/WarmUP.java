package day16_MoreStringMethods;

public class WarmUP{
	public static void main(String[] args) {
		
		String str= "Sunday is Java Day";
		
		System.out.println("All upper case: "+str.toUpperCase());
		System.out.println("Last 2 chars: "+str.substring(str.length()-2));
		System.out.println("Position of \"is\": "+str.indexOf("is"));
		System.out.println("str contains \"Java\": "+str.contains("Java"));
		
		//Optional:
		int firstSpace = str.indexOf(32);                //first space index=6
		int secondSpace = str.indexOf(32, firstSpace+1); //second space index=9
		int thirdSpace = str.indexOf(32, secondSpace+1); //third space index=14
		                                                                        //(10, 14)
		System.out.println("Third word of sentence is: "+str.substring(secondSpace+1, thirdSpace));
	}

}
