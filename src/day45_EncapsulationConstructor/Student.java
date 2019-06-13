package day45_EncapsulationConstructor;

public class Student {
	
	String name;
	int age;
	String major;
	//one constructor can e called 
	//in amother constructor of same class
	//this (arguments)
	
	public Student() {
		this("No Name"); //calling constructor with 1 arg to put default name
		
		System.out.println("No Arg");
	}
	
	public Student(String name) {
		System.out.println("1 arg "+name);
	}

	public Student(String name, int age, String major) {
		this();
		System.out.println("3 args");
//		this.name = name;
//		this.age = age;
//		this.major = major;
	}
	
	
	
	

}
