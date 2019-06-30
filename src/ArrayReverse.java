
public class ArrayReverse {
	public static void main(String[] args) {
		
		int array [] = {10,20,30,40,50};
		int x = array.length;
		//a
//		while (x>0) {
//			x--;
//			System.out.println(array[x]);
//		}
		
		//b - out of bounds
//		do {
//			x--;
//			System.out.println(array[x]);		
//		}while (x>=0);
		
		//c- out of bounds
//		while (x>=0) {
//			
//			System.out.println(array[x]);
//			x--;
//		}
		
		//b
		do {
			x--;
			System.out.println(array[x]);		
		}while (x>=0);
		
		
	}

}
