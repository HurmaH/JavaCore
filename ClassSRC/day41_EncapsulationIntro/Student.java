package day41_EncapsulationIntro;

public class Student {
	
	String name;
	int age;
	long ssn;
	
	public void displayName() {
		System.out.println("name is :"+name); //if public static... -->cannot make static reference to the non static field
	}
	
	public void displayNameAndAge() {
		System.out.println("name is :"+name); 
	}

}
