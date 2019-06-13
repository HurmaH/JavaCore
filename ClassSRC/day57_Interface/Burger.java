package day57_Interface;

public class Burger implements Edible {
	
	String name;
	double size;
	
	public Burger(String name, double size) {
		//super();
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}

	@Override
	public void eat() {
		System.out.println("Spartan eating burger");
		
	}
	
	

}
