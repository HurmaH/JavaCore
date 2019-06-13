package day58_Interface_PolymorphismIntro;

public class Dog extends Animal implements IndoorPet{
	String breed;
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}

}
