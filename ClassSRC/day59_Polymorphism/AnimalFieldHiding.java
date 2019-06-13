package day59_Polymorphism;

import day58_Interface_PolymorphismIntro.*; //importing day58 package

public class AnimalFieldHiding extends Animal {
	
	public static void main(String[] args) {
		Animal myAnimal1=new Dog();
		System.out.println(myAnimal1.legsCount);
	}

}
