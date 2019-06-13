package day32_ReturnMethod;

public class ReturnedValue {
	public static void main(String[] args) {
		giveMeLastChar("Mishkalar");
		System.out.println();
	}
	
	public static char giveMeLastChar (String name) {
		char last = name.charAt(name.length()-1);
		System.out.println(last);
		return last;//you can print here
	}

}
