package day34_ReturnVARargsCommand;

public class WarmUp {
	public static void main(String[] args) {
		
		//Method 1 invoked --- true/false
		System.out.println(isPallindrome ("civic")); //true
		System.out.println(isPallindrome ("was it a car or a cat I saw"));//true
		System.out.println(isPallindrome ("lemon"));//false
		System.out.println(isPallindrome ("hurmik"));//false
		
		//Method 2 invoked
		System.out.println(reverseString ("civic"));  //civic
		System.out.println(reverseString ("was it a car or a cat i saw")); //wasitacaroracatisaw
		System.out.println(reverseString ("lemon")); //nomel
		System.out.println(reverseString ("hurmik")); // kimruh
		
		//Method 3 invoked
		System.out.println(isPallindrome2 ("civic"));  //true
		System.out.println(isPallindrome2 ("was it a car or a cat i saw"));//true
		System.out.println(isPallindrome2 ("lemon")); //false
		System.out.println(isPallindrome2 ("hurmik")); // false
	}
	
	//1. checking word is it pallindrome or not returns true or false
	public static boolean isPallindrome (String str) {
		
		str = str.replace(" ", ""); //to remove all spaces
		
		String reverse="";          
		
		for (int i=str.length()-1; i>=0; i--) {  //loop through each letter
			reverse +=str.charAt(i);             //each letter added to empty reverse string
		}
		
		return reverse.equalsIgnoreCase(str);             //reverse.equals(str) -->this is boolean value, so we can use it directly
	}
	
	//2. reversing a word and returned reversed word as String
	public static String reverseString (String str2) {
		str2 = str2.replaceAll(" ", "");
		String reverse="";
		
		for (int i=str2.length()-1; i>=0; i--) {
			reverse +=str2.charAt(i);
		}
		
		return reverse;
		
	}
	
	//3. invoke reverseString method inside method
    public static boolean isPallindrome2 (String str3) {
		
		String reverse = reverseString(str3);
		return reverse.equals(str3);
	}
	
}
