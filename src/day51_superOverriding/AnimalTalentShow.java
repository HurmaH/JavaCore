package day51_superOverriding;

public class AnimalTalentShow {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeNoise();
		
		System.out.println("Object dog:");
		dog d1 = new dog();
		d1.makeNoise();
		
		System.out.println("Object horse:");
		horse h1 = new horse();
		h1.makeNoise();
	}

}
