package SundayAssessment;

import java.util.Scanner;

public class Repl5_2 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    System.out.print("#1: ");
    int num1 = s.nextInt();
    System.out.print("#2: ");
    int num2 = s.nextInt();
    //start on line 11
    
    
    for (int i=num1; i<=num2; i++){
      if (i%2==1 || i%2==(-1) ) {
        System.out.print(i+" ");
      }
    }
    
    
}
}
