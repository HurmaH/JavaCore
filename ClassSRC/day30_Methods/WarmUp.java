package day30_Methods;

import java.util.Scanner;

public class WarmUp {
	
		/*
		 * WARM UP
1, Create a static method
called  sayHello :
this method return nothing
and does not take any parameter

and it will greeting spartan

2, Create a static method
called  sayGoodBye :
this method return nothing
and does not take any parameter

and it will good bye spartan

3, Create a static method
called  sayHelloTo :
this method return nothing
and take 1 String name as parameter

and it will greeting --the Name You passed
		 */
		public static void main(String[] args) {
			
			Scanner scan = new Scanner (System.in);
			
			sayHello();
			sayGoodBye();
			sayHelloTo("Mekanym");
			
			System.out.println("Enter name:");
			String name = scan.next();
			sayHelloTo(name);
		}
		
		//1
		public static void sayHello() {
			System.out.println("Greeting Spartan!");
		}
		
		//2
		public static void sayGoodBye() {
			System.out.println("Good Bye Spartan!");
		}
		
		//3
		public static void sayHelloTo(String name) {
			System.out.println("Greeting "+name+"!");
		}

}
