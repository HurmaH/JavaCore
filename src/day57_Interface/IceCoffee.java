package day57_Interface;

public class IceCoffee implements Drinkable {
	
	double size;
	
	public IceCoffee() {
		size =3;
	}
	
	public static void main(String[] args) {
		Burger b1 = new Burger("BlackBeanBurger", 5);
		b1.eat();
		
		 IceCoffee coffee = new IceCoffee(); 
		    coffee.eat();
		    coffee.drink();
	}

	public IceCoffee(double size) {
		//super();
		this.size = size;
	}
	
	 

	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}

	@Override
	public void drink() {
		
		System.out.println("Esra is drinking ice coffee");
		
	}

	@Override
	public void eat() {
		System.out.println("is coffee can be consumed by drinking");
		
	}
	
	
	
	
	
	

}
