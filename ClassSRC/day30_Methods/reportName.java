package day30_Methods;

public class reportName {
	public static void main(String[] args) {
		reportName("Hurmik", "Hayti");
		reverseString ("Cybertek");
	}
	
	//reportName 
	public  static void reportName(String firstName, String lastName) {
		System.out.println("Length of firstName: "+firstName.length()+", and length of lastName: "+lastName.length());
		System.out.println("Initials together is:"+firstName.charAt(0)+lastName.charAt(0));	
	}

	//reverseString
	public  static void reverseString (String str) {
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	//
}
