package day58_Interface_PolymorphismIntro;

import java.util.Arrays;

public class AnimalShow2 {
	public static void main(String[] args) {
		Animal [] animalArr = new Animal [3];
	    animalArr[0] = new Dog();
	    animalArr[1] = new Cat();
	    animalArr[2] = new Horse();
	    
	    System.out.println(Arrays.toString(animalArr));
	}
	
	

}
