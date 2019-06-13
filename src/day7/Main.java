package day7;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
    
     int num1, num2, num3, sum;
     
     Scanner input = new Scanner (System.in);
     
     System.out.println("Enter 3 numbers:");
     num1= input.nextInt();
     num2= input.nextInt();
     num3= input.nextInt();
     
     sum = num1+num2+num3;
     
     System.out.println("Sum of numbers: "+sum);
     
     int numberOfStudents = 300;
     String batchName = "Spartans";
     String fullName = numberOfStudents + batchName;
     System.out.println(fullName);
     
     input.close();
    }
}
