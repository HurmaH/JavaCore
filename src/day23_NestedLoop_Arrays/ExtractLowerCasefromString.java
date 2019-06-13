package day23_NestedLoop_Arrays;

public class ExtractLowerCasefromString {
	public static void main(String[] args) {
		
		String str = "a1b2c3"; //get --> abc
		String lowerCase = "";
		String numbers = "";
		int sum =0;
		System.out.println("Lowercase of the string is "+ str.replaceAll("[^a-z]", ""));
		
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				lowerCase +=str.charAt(i);
			}
		}
		System.out.print(lowerCase);
		System.out.println();
		
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				numbers += str.charAt(i);
			}
		}
		System.out.print(numbers);
		
		//adding each number
		for (int i=0; i<10; i++) {
			if (i==str.charAt(i)) {
				
			}
		}
	
	
	
	}

}
