package day48_InheritanceIntro;

public class Horse extends Animal  {
	//visible/inherited fields from super class
	/*
	 * String color;
	   boolean wild;
	   int legCount;
	 */
	int shoesCount;
	int horsepower;
	
	public static void main(String[] args) {
		
		Horse h1 = new Horse ();
		//h1.breed= "spartan";
		h1.wild = false;
		h1.horsepower=600;
		//System.out.println(h1.breed);
		System.out.println(h1.horsepower);
		
		
		Animal a1 = new Animal();
		a1.wild = false;
		
		//System.out.println(a1.breed);breed is not visible
		System.out.println(a1.color);
		System.out.println(a1.wild);
		System.out.println(a1.legCount);
		//System.out.println(a1.horsePower);
	}

}
