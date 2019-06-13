package day20_DoWhile;
import java.util.Scanner;


public class DoWhileSum {
	
	public static void main(String[] args) {
		
		//TASK 3:
		
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		
		int sum = 0;
		int x= 1;
		
		do {
			sum += x;
			System.out.println("x: "+x+", sum:"+sum);
			x++;
			if (sum>40) {
				break;
			}
					
		}while (x<=num);
		
		System.out.println(sum);
		
		scan.close();
	}

}
