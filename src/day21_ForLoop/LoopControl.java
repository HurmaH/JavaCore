package day21_ForLoop;

public class LoopControl {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			
			if(i==5) {
				continue;//skip
			}
			
			System.out.println("Got smart water");
			break;
		}
	}

}
