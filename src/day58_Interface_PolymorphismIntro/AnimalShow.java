package day58_Interface_PolymorphismIntro;

public class AnimalShow {
	
	public static void main(String[] args) {
		//Dog is Dog
		//reference type = actual object type
		Dog d             = new Dog(); 
		
		//Dog is Animal
		//reference type = actual object type
		Animal a1        = new Dog();
		//Dog d1           = new Animal();
		
		//Dog is IndoorPet
		//reference type = actual object type
		IndoorPet i1     = new Dog();
		
		
		Horse h1 = new Horse();//Horse is Horse
		Animal a2 = new Horse();//Horse is animal
		
		//IndoorPet i2 = new Horse();//Horse and IndoorPet no relationship
		//reference type = actual object type
		
	    Animal a3 = new	Puppy();
	}

}
