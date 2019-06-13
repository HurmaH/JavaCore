package day60_Polymorphism;
import day58_Interface_PolymorphismIntro.*;
//Director ----> Manager ----> Employee
public class Director extends Manager{
	//double salary
	//int budget
	int stockOption = 50000;
	
	public static void main(String[] args) {
		
		Director e1 = new Director();
		System.out.println(e1); //gives hashcode
		
		Employee e2 = new Director();
		System.out.println(e2.salary);//only Salary field is available
		
		//How to access Director's stock option
		//in order to access Director specific field we need to refer the Director as Director
		
		long myLong = 100;    // upcasting
		int i = (int) myLong;  //downcasting
		
		Director d1 = (Director) e2;
		System.out.println(d1.salary);
		System.out.println(d1.budget);
		System.out.println(d1.stockOption);
		
		Director d2 = new Director();
		System.out.println(d2.salary);
		System.out.println(d2.budget);
		System.out.println(d2.stockOption);
		
		Object o = new Object();
		Dog puppy = (Dog) o;
		puppy.makeNoise();
		
	}
	
	
	

}
