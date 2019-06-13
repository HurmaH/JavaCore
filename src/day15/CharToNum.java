package day15;

public class CharToNum {
	public static void main(String[] args) {
		
		char c1 ='H';
		int cNum = c1;
		System.out.println(c1);
		System.out.println(cNum);
		
		String name = "Mekan";
		char fChar = name.charAt(0);
		char lChar = name.charAt(name.length()-1);
		System.out.println("First Char: "+fChar);
		System.out.println("Last Char: "+lChar);
		System.out.println("Printing 1rst and last char:"+fChar+lChar);
		int fNum = name.charAt(0);
		int lNum = name.charAt(name.length()-1);
		
		System.out.println("First Number: "+fNum);
		System.out.println("Last Numberr: "+lNum);
		
	}

}
