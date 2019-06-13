package day20_DoWhile;

public class GettingCharForLoop {
	
	public static void main(String[] args) {
		
		String name = "Hurmik Mishka Moshkalar";
		
		for (int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println();
		
		//print reverse
		for (int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i)+" ");
		}
	}

}
