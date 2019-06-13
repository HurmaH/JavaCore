package day59_Polymorphism;
import day58_Interface_PolymorphismIntro.*; //importing day58 package

public class AnimalShow59 {
	
	public static void main(String[] args) {
		
		//Cat is a Cat
		Cat c1 = new Cat();
		
		//Cat is an Animal
		Animal c2 = new Cat();
		
		//Cat is an IndorPet
		IndoorPet c3 = new Cat();
		
		//Cat IS-A Object
		Object c4 = new Cat();
		
		//--------------------------
		//copying the address stored inside c1
		//into c5 variable
		Cat c5 = c1;
		
		//c1 = newDog();
		Animal a1 = c1;
		
		Animal myAnimal = new Animal();
		myAnimal.makeNoise();// general Noise
		//if the method is abstract in super class, 
		//super class should be abstract as well. 
		//However in that case we cannot create Animal object
		
		myAnimal = new Cat();
		myAnimal.makeNoise();//Miao Miao
		
		myAnimal = new Dog();
		myAnimal.makeNoise();//Woof Woof
		
		new Dog().makeNoise();//woof woof
		
		//Fields application
		//If you refer DOg as animal
		//it will do only general animal related stuff
		Animal a2 = new Dog();
		System.out.println(a2.legsCount);
		//a2.breed; cannot reach 
		
	}

}
