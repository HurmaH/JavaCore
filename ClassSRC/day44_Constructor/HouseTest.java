package day44_Constructor;
//immutable object sample
//immutable - a way an object is that created and cannot be changed at all
//immutable read only object, no set Method, only getMethod available
public class HouseTest {
	
	public static void main(String[] args) {
		
		House h1 = new House ("single house", 5, 120000);
		House h2 = new House ("town house", 4, 200000);
		House h3 = new House ("appartment", 2, 100000);
		House h4 = new House ("single house", 4, 150000);
		
		//changing instance field alues for each object:
		h1.setBedroom(6);//you cannot just add 1 room
		h3.setType("single bedroom");
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
	}

}
