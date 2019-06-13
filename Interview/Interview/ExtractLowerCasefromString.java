package Interview;

public class ExtractLowerCasefromString {
	public static void main(String[] args) {
		
		String str = "a1b2c3"; //get --> abc
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.print(str.charAt(i));
			}
		}
		
		
	}

}
