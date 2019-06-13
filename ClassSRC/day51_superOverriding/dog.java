package day51_superOverriding;

public class dog extends Animal {
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Dog makes noise - woof woof");
		
		super.eat();//calling eat method from super class
		eat();      //you can directly call
		this.eat(); //
		
		//makeNoise(); ---Calling each other, recursive calling
	}

}
