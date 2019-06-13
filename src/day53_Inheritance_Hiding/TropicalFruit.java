package day53_Inheritance_Hiding;

public class TropicalFruit extends Fruit{
	
	public static void main(String[] args) {
		
		generateJuice();                //way 1: Calling directly, will call closest method
		Fruit.generateJuice();         //way2 from parent class
		TropicalFruit.generateJuice(); //way 3 from child class
	}
	//@Override will give error as it is static, 
	//hiding static method
	public static void generateJuice() {
		System.out.println("Generaye TropicalFruit Juice");
	}
	

}

//Different class

class Fruit {
	public static void generateJuice() {
		System.out.println("Generaye general Juice");
	}
}
