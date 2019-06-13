package day43_EncapsulationConstructorIntro;

public class Course {
	// constructor 
	  //---> a special method that being called whenever an object is created
	  // it has same name as class name 
	  // it has no return type ---(this does not mean return type is void)
	  
	  // if you don't explicitly create one like below 
	  // compiler will add a empty constructor for you  
	  // because we can not call something we don't have
	
	
	String name;
	int courseID;
	
	//Modify this constructor
	/*
	 * if any object is being created
	 * using no-arg constructor
	 * the first name should be set to unknown
	 * the course Id should be set to 100;
	 */
	public Course() {
		this.name="Unknown";
		this.courseID = 10;
		System.out.println("Course constructor is invoked");
	}
	
	 public Course(String name) {
		    this.name=name;
		    System.out.println("passing argument");
	}

	
	//another constructor with two parameter
	public Course(String name, int courseID) {
		this.name=name;
		this.courseID=courseID;
		System.out.println("Passing name and courseID");
	}
	
	
	
	

}
