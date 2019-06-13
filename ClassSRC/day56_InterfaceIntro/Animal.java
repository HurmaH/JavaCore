package day56_InterfaceIntro;

public abstract class Animal {
	
	public abstract void makeNoise();

}

//what if sub class is also abstract class
//YOU ARE NOT REQUIRED TO IMPLEMENT ABSTRACT METHODS INHERITED FROM SUPER CLASS
//abstract sub class has option not to provide implementation so subclass of this class can use it as is
//or override what is inherited

abstract class Mammals extends Animal {
	
	public abstract void makeNoise();//inheriting, no need toimplement/override
	
	public abstract void eat (String foodName);
	
	
	
}

class Horse extends Mammals {
	
	@Override 
	public void makeNoise() {
		System.out.println("neigh neigh");
	}
	
	@Override
	public void eat(String foodName) {
		System.out.println("Eating "+foodName);
	}
}
