package day20_DoWhile;

public class WhileTrue {
	
	public static void main(String[] args) {
		
		int x= 0;
		
		while (true) {
			//System.out.println("ACtion");
			x++;
			System.out.println(x);
			
			if (x==10) {
				break;
			}
		}
	}

}
