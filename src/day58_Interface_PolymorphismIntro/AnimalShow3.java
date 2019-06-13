package day58_Interface_PolymorphismIntro;

public class AnimalShow3 {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.makeNoise();
		
		Animal a2 = new Horse ();
		a2.makeNoise();
	}

}
