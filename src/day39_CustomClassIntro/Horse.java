package day39_CustomClassIntro;

public class Horse {
	
	//instance variables
	String breed;
	String color;
	int age;
	double height;
	
	public static void main(String[] args) {
		
		Horse h1 = new Horse();
		h1.breed = "Ahal-Teke";
		h1.color = "Golden";
		h1.age = 10;
		h1.height = 5.50;
		
		Horse h2 = new Horse();
		h2.breed = "Arabian";
		h2.color = "Black";
		h2.age = 5;
		h2.height = 5.10;
		
		System.out.println(h1.color);
		System.out.println(h2.color);
		
		//reassign to new value
		h1.color = "brown";
		System.out.println(h1.color);
		System.out.println(h2.color);
	}

}
