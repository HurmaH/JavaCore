package day42_CustomClassReview;

public class DogTest {
	
	public static void main(String[] args) {
		Dog d1 = new Dog(); //new object created
	    d1.name = "puppy";
	    d1.breed = "husky";
	    
	    Dog d2 = d1;       //d2 pointing to same object as d1
	    d2.name = "alabay";
	    
	    System.out.println(d1.name);
	    System.out.println(d2.name);
	    
	    
	}
	

}
