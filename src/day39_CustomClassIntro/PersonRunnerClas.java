package day39_CustomClassIntro;

public class PersonRunnerClas {
	public static void main(String[] args) {
		
		Person p1 = new Person();
	    p1.name = "Talmurat";
	    p1.age = 1;
	    p1.gender= 'M';
	    
	    Person p2 = new Person ();
	    p2.name = "Mekan";
	    p2.age = 32;
	    p2.gender = 'M';
	    
	    Person p3 = new Person ();
	    p3.name = "Hurmik";
	    p3.age = 18;
	    p3.gender = 'F';	    
	       
	    //exploring behavior
	      Person.eat(); //works with static method
	    //Person.eat2() //cannot make static reference to a non-static method
	    
	    p2.eat();
	    p2.eat2();
	    
	    p2.tellMeYourName();
	    p2.printPersonInfo();
	    
        p3.eat2();
	    p3.tellMeYourName();
	    p3.printPersonInfo();

	}
	
}
