package day42_CustomClassReview;

public class Employee {
	
	//public, protected, default, private
	/*
	 * 1. public accesible anywhere
	 * 2. protected
	 * 3. default: only in same package - package private
	 * 4. private: only in same class
	 * 
	 */
	
	//instance variables -->> used to define properties | attributes of the objects
	String name;
	int age;
	String title;
	double salary;
	
	//instance methods --->>
	//used to read or manipulate the properties | attribute of the object
	
	public void printAllInfo () {
		System.out.println("Name is "+name +
				           ", age is " + age+
				           ", title is "+ title+
				           ", salary is "+salary);
	}

}
