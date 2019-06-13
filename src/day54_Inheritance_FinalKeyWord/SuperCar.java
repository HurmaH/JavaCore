package day54_Inheritance_FinalKeyWord;

public class SuperCar {
	
	public static void main(String[] args) {
		
		Engine e = null;
		//e.start(); //NULL point exeption 
		
		
		Engine e1 = new Engine("turbo", 8);
		System.out.println(e1.cylinderCount);
		System.out.println(e1.toString());
		
		SuperCar spartanHorse = new SuperCar("SpartanHorse", "Cybertek", e1);//"SpartanHorse", "Cybertek", 12--->in constructor undefined
		System.out.println(spartanHorse);
		
	}
	
	//instance fields
	final String model;
	final String make;
	final Engine engine;
	
	
	
	public SuperCar(String model, String make, Engine engine) {
		//super();
		this.model = model;
		this.make = make;
		this.engine = engine;
	}



	public void start() {
		//super.start(); //BAD - there is no super class
		//this.start()-recursive
		//this.engine.start //GOOD
		engine.start();  //GOOD
		System.out.println("Super car make <"+make
				                +">, model<"+model
				                +"> with <"+engine.cylinderCount
				                +"is starting");
	}

	@Override
	public String toString() {
		return "SuperCar [model=" + model 
				      + ", make=" + make 
				      + ", engine=" + engine + "]";
	}
	
	
	
	

}
